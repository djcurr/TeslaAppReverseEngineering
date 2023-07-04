package org.godotengine.godot;

import android.app.Activity;
import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.godotengine.godot.input.GodotEditText;

/* loaded from: classes5.dex */
public class GodotIO {
    protected static final String PREFS_DEVICE_ID = "device_id";
    protected static final String PREFS_FILE = "device_id.xml";
    public static final int SYSTEM_DIR_DCIM = 1;
    public static final int SYSTEM_DIR_DESKTOP = 0;
    public static final int SYSTEM_DIR_DOCUMENTS = 2;
    public static final int SYSTEM_DIR_DOWNLOADS = 3;
    public static final int SYSTEM_DIR_MOVIES = 4;
    public static final int SYSTEM_DIR_MUSIC = 5;
    public static final int SYSTEM_DIR_PICTURES = 6;
    public static final int SYSTEM_DIR_RINGTONES = 7;
    public static String unique_id = "";
    final Activity activity;

    /* renamed from: am  reason: collision with root package name */
    AssetManager f43236am;
    private Object buf;
    GodotEditText edit;
    private Thread mAudioThread;
    private AudioTrack mAudioTrack;
    MediaPlayer mediaPlayer;
    final int SCREEN_LANDSCAPE = 0;
    final int SCREEN_PORTRAIT = 1;
    final int SCREEN_REVERSE_LANDSCAPE = 2;
    final int SCREEN_REVERSE_PORTRAIT = 3;
    final int SCREEN_SENSOR_LANDSCAPE = 4;
    final int SCREEN_SENSOR_PORTRAIT = 5;
    final int SCREEN_SENSOR = 6;
    public int last_file_id = 1;
    public int last_dir_id = 1;
    SparseArray<AssetData> streams = new SparseArray<>();
    SparseArray<AssetDir> dirs = new SparseArray<>();

    /* loaded from: classes5.dex */
    class AssetData {
        public boolean eof = false;

        /* renamed from: is  reason: collision with root package name */
        public InputStream f43237is;
        public int len;
        public String path;
        public int pos;

        AssetData() {
        }
    }

    /* loaded from: classes5.dex */
    class AssetDir {
        public int current;
        public String[] files;
        public String path;

        AssetDir() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GodotIO(Activity activity) {
        this.f43236am = activity.getAssets();
        this.activity = activity;
    }

    public Object audioInit(int i11, int i12) {
        System.out.printf("audioInit: initializing audio:\n", new Object[0]);
        int max = Math.max(i12, ((AudioTrack.getMinBufferSize(i11, 12, 2) + 4) - 1) / 4);
        this.mAudioTrack = new AudioTrack(3, i11, 12, 2, max * 4, 1);
        audioStartThread();
        short[] sArr = new short[max * 2];
        this.buf = sArr;
        return sArr;
    }

    public void audioPause(boolean z11) {
        if (z11) {
            this.mAudioTrack.pause();
        } else {
            this.mAudioTrack.play();
        }
    }

    public void audioQuit() {
        Thread thread = this.mAudioThread;
        if (thread != null) {
            try {
                thread.join();
            } catch (Exception e11) {
                Log.v("Godot", "Problem stopping audio thread: " + e11);
            }
            this.mAudioThread = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.mAudioTrack = null;
        }
    }

    public void audioStartThread() {
        Thread thread = new Thread(new Runnable() { // from class: org.godotengine.godot.GodotIO.1
            @Override // java.lang.Runnable
            public void run() {
                GodotIO.this.mAudioTrack.play();
                GodotLib.audio();
            }
        });
        this.mAudioThread = thread;
        thread.setPriority(10);
        this.mAudioThread.start();
    }

    public void audioWriteShortBuffer(short[] sArr) {
        int i11 = 0;
        while (i11 < sArr.length) {
            int write = this.mAudioTrack.write(sArr, i11, sArr.length - i11);
            if (write > 0) {
                i11 += write;
            } else if (write == 0) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
            } else {
                Log.w("Godot", "Godot audio: error return from write(short)");
                return;
            }
        }
    }

    public void dir_close(int i11) {
        if (this.dirs.get(i11) == null) {
            System.out.printf("dir_close: invalid dir id: %d\n", Integer.valueOf(i11));
        } else {
            this.dirs.remove(i11);
        }
    }

    public boolean dir_is_dir(int i11) {
        if (this.dirs.get(i11) == null) {
            System.out.printf("dir_next: invalid dir id: %d\n", Integer.valueOf(i11));
            return false;
        }
        AssetDir assetDir = this.dirs.get(i11);
        int i12 = assetDir.current;
        if (i12 > 0) {
            i12--;
        }
        String[] strArr = assetDir.files;
        if (i12 >= strArr.length) {
            return false;
        }
        String str = strArr[i12];
        try {
            if (assetDir.path.equals("")) {
                this.f43236am.open(str);
            } else {
                this.f43236am.open(assetDir.path + "/" + str);
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public String dir_next(int i11) {
        if (this.dirs.get(i11) == null) {
            System.out.printf("dir_next: invalid dir id: %d\n", Integer.valueOf(i11));
            return "";
        }
        AssetDir assetDir = this.dirs.get(i11);
        int i12 = assetDir.current;
        String[] strArr = assetDir.files;
        if (i12 >= strArr.length) {
            assetDir.current = i12 + 1;
            return "";
        }
        String str = strArr[i12];
        assetDir.current = i12 + 1;
        return str;
    }

    public int dir_open(String str) {
        AssetDir assetDir = new AssetDir();
        assetDir.current = 0;
        assetDir.path = str;
        try {
            String[] list = this.f43236am.list(str);
            assetDir.files = list;
            if (list.length == 0) {
                return -1;
            }
            int i11 = this.last_dir_id + 1;
            this.last_dir_id = i11;
            this.dirs.put(i11, assetDir);
            return this.last_dir_id;
        } catch (IOException e11) {
            System.out.printf("Exception on dir_open: %s\n", e11);
            return -1;
        }
    }

    public void file_close(int i11) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_close: Can't close invalid file id: %d\n", Integer.valueOf(i11));
        } else {
            this.streams.remove(i11);
        }
    }

    public boolean file_eof(int i11) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_read: Can't check eof for invalid file id: %d\n", Integer.valueOf(i11));
            return false;
        }
        return this.streams.get(i11).eof;
    }

    public int file_get_size(int i11) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_get_size: Invalid file id: %d\n", Integer.valueOf(i11));
            return -1;
        }
        return this.streams.get(i11).len;
    }

    public int file_open(String str, boolean z11) {
        InputStream open;
        if (z11) {
            return -1;
        }
        AssetData assetData = new AssetData();
        try {
            open = this.f43236am.open(str);
            assetData.f43237is = open;
        } catch (Exception unused) {
        }
        try {
            assetData.len = open.available();
            assetData.path = str;
            assetData.pos = 0;
            int i11 = this.last_file_id + 1;
            this.last_file_id = i11;
            this.streams.put(i11, assetData);
            return this.last_file_id;
        } catch (Exception unused2) {
            System.out.printf("Exception availabling on file_open: %s\n", str);
            return -1;
        }
    }

    public byte[] file_read(int i11, int i12) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_read: Can't read invalid file id: %d\n", Integer.valueOf(i11));
            return new byte[0];
        }
        AssetData assetData = this.streams.get(i11);
        int i13 = assetData.pos;
        int i14 = i13 + i12;
        int i15 = assetData.len;
        if (i14 > i15) {
            i12 = i15 - i13;
            assetData.eof = true;
        }
        if (i12 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i12];
        try {
            int read = assetData.f43237is.read(bArr);
            if (read == 0) {
                return new byte[0];
            }
            assetData.pos += read;
            if (read < i12) {
                byte[] bArr2 = new byte[read];
                for (int i16 = 0; i16 < read; i16++) {
                    bArr2[i16] = bArr[i16];
                }
                return bArr2;
            }
            return bArr;
        } catch (IOException e11) {
            System.out.printf("Exception on file_read: %s\n", e11);
            return new byte[i12];
        }
    }

    public void file_seek(int i11, int i12) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_get_size: Invalid file id: %d\n", Integer.valueOf(i11));
            return;
        }
        AssetData assetData = this.streams.get(i11);
        int i13 = assetData.len;
        if (i12 > i13) {
            i12 = i13;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        try {
            int i14 = assetData.pos;
            if (i12 > i14) {
                int i15 = i12 - i14;
                while (i15 > 0) {
                    long j11 = i15;
                    i15 = (int) (j11 - assetData.f43237is.skip(j11));
                }
                assetData.pos = i12;
            } else if (i12 < i14) {
                assetData.f43237is = this.f43236am.open(assetData.path);
                assetData.pos = i12;
                while (i12 > 0) {
                    long j12 = i12;
                    i12 = (int) (j12 - assetData.f43237is.skip(j12));
                }
            }
            assetData.eof = false;
        } catch (IOException e11) {
            System.out.printf("Exception on file_seek: %s\n", e11);
        }
    }

    public int file_tell(int i11) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_read: Can't tell eof for invalid file id: %d\n", Integer.valueOf(i11));
            return 0;
        }
        return this.streams.get(i11).pos;
    }

    public String getDataDir() {
        return this.activity.getFilesDir().getAbsolutePath();
    }

    public String getLocale() {
        return Locale.getDefault().toString();
    }

    public String getModel() {
        return Build.MODEL;
    }

    public int getScreenDPI() {
        return (int) (this.activity.getApplicationContext().getResources().getDisplayMetrics().density * 160.0f);
    }

    public String getSystemDir(int i11) {
        String str;
        switch (i11) {
            case 0:
                str = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 1:
                str = Environment.DIRECTORY_DCIM;
                break;
            case 2:
                str = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 3:
                str = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 4:
                str = Environment.DIRECTORY_MOVIES;
                break;
            case 5:
                str = Environment.DIRECTORY_MUSIC;
                break;
            case 6:
                str = Environment.DIRECTORY_PICTURES;
                break;
            case 7:
                str = Environment.DIRECTORY_RINGTONES;
                break;
            default:
                str = "";
                break;
        }
        return str.equals("") ? "" : Environment.getExternalStoragePublicDirectory(str).getAbsolutePath();
    }

    public String getUniqueID() {
        return unique_id;
    }

    public void hideKeyboard() {
        GodotEditText godotEditText = this.edit;
        if (godotEditText != null) {
            godotEditText.hideKeyboard();
        }
    }

    public boolean isVideoPlaying() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: ActivityNotFoundException -> 0x007c, TryCatch #0 {ActivityNotFoundException -> 0x007c, blocks: (B:2:0x0000, B:5:0x0020, B:7:0x0039, B:9:0x0041, B:11:0x0049, B:16:0x0056, B:18:0x0066, B:20:0x0075, B:19:0x006e), top: B:25:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: ActivityNotFoundException -> 0x007c, TryCatch #0 {ActivityNotFoundException -> 0x007c, blocks: (B:2:0x0000, B:5:0x0020, B:7:0x0039, B:9:0x0041, B:11:0x0049, B:16:0x0056, B:18:0x0066, B:20:0x0075, B:19:0x006e), top: B:25:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int openURI(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MyApp"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L7c
            r1.<init>()     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r2 = "TRYING TO OPEN URI: "
            r1.append(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            r1.append(r5)     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r1 = r1.toString()     // Catch: android.content.ActivityNotFoundException -> L7c
            android.util.Log.v(r0, r1)     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r1 = ""
            if (r0 == 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L7c
            r0.<init>()     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r2 = "file://"
            r0.append(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            r0.append(r5)     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r0 = r0.toString()     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r2 = ".png"
            boolean r2 = r5.endsWith(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            if (r2 != 0) goto L51
            java.lang.String r2 = ".jpg"
            boolean r2 = r5.endsWith(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            if (r2 != 0) goto L51
            java.lang.String r2 = ".gif"
            boolean r2 = r5.endsWith(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            if (r2 != 0) goto L51
            java.lang.String r2 = ".webp"
            boolean r5 = r5.endsWith(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            if (r5 == 0) goto L55
        L51:
            java.lang.String r5 = "image/*"
            goto L56
        L54:
            r0 = r5
        L55:
            r5 = r1
        L56:
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L7c
            r2.<init>()     // Catch: android.content.ActivityNotFoundException -> L7c
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.setAction(r3)     // Catch: android.content.ActivityNotFoundException -> L7c
            boolean r1 = r5.equals(r1)     // Catch: android.content.ActivityNotFoundException -> L7c
            if (r1 != 0) goto L6e
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: android.content.ActivityNotFoundException -> L7c
            r2.setDataAndType(r0, r5)     // Catch: android.content.ActivityNotFoundException -> L7c
            goto L75
        L6e:
            android.net.Uri r5 = android.net.Uri.parse(r0)     // Catch: android.content.ActivityNotFoundException -> L7c
            r2.setData(r5)     // Catch: android.content.ActivityNotFoundException -> L7c
        L75:
            android.app.Activity r5 = r4.activity     // Catch: android.content.ActivityNotFoundException -> L7c
            r5.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L7c
            r5 = 0
            return r5
        L7c:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.godotengine.godot.GodotIO.openURI(java.lang.String):int");
    }

    public void pauseVideo() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void playVideo(String str) {
        Uri parse = Uri.parse(str);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        try {
            mediaPlayer.setAudioStreamType(3);
            this.mediaPlayer.setDataSource(this.activity.getApplicationContext(), parse);
            this.mediaPlayer.prepare();
            this.mediaPlayer.start();
        } catch (IOException unused) {
            System.out.println("IOError while playing video");
        }
    }

    public void setEdit(GodotEditText godotEditText) {
        this.edit = godotEditText;
    }

    public void setScreenOrientation(int i11) {
        switch (i11) {
            case 0:
                this.activity.setRequestedOrientation(0);
                return;
            case 1:
                this.activity.setRequestedOrientation(1);
                return;
            case 2:
                this.activity.setRequestedOrientation(8);
                return;
            case 3:
                this.activity.setRequestedOrientation(9);
                return;
            case 4:
                this.activity.setRequestedOrientation(6);
                return;
            case 5:
                this.activity.setRequestedOrientation(7);
                return;
            case 6:
                this.activity.setRequestedOrientation(10);
                return;
            default:
                return;
        }
    }

    public void showKeyboard(String str, int i11, int i12, int i13) {
        GodotEditText godotEditText = this.edit;
        if (godotEditText != null) {
            godotEditText.showKeyboard(str, i11, i12, i13);
        }
    }

    public void stopVideo() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }
}
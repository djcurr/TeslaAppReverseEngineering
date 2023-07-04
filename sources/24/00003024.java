package com.google.android.gms.vision;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.vision.Frame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public class CameraSource {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    private int facing;
    private int rotation;
    private Context zze;
    private final Object zzf;
    private Camera zzg;
    private Size zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private SurfaceTexture zzm;
    private boolean zzn;
    private Thread zzo;
    private zzb zzp;
    private Map<byte[], ByteBuffer> zzq;

    /* loaded from: classes3.dex */
    public static class Builder {
        private final Detector<?> zzr;
        private CameraSource zzs;

        public Builder(Context context, Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.zzs = cameraSource;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if (detector != null) {
                this.zzr = detector;
                cameraSource.zze = context;
                return;
            }
            throw new IllegalArgumentException("No detector supplied.");
        }

        public CameraSource build() {
            CameraSource cameraSource = this.zzs;
            cameraSource.getClass();
            cameraSource.zzp = new zzb(this.zzr);
            return this.zzs;
        }

        public Builder setAutoFocusEnabled(boolean z11) {
            this.zzs.zzl = z11;
            return this;
        }

        public Builder setFacing(int i11) {
            if (i11 == 0 || i11 == 1) {
                this.zzs.facing = i11;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("Invalid camera: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }

        public Builder setRequestedFps(float f11) {
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                StringBuilder sb2 = new StringBuilder(28);
                sb2.append("Invalid fps: ");
                sb2.append(f11);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.zzs.zzi = f11;
            return this;
        }

        public Builder setRequestedPreviewSize(int i11, int i12) {
            if (i11 <= 0 || i11 > 1000000 || i12 <= 0 || i12 > 1000000) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Invalid preview size: ");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.zzs.zzj = i11;
            this.zzs.zzk = i12;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    /* loaded from: classes3.dex */
    public interface ShutterCallback {
        void onShutter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class zza implements Camera.PreviewCallback {
        private zza() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.zzp.zza(bArr, camera);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class zzb implements Runnable {
        private Detector<?> zzr;
        private long zzw;
        private ByteBuffer zzy;
        private long zzu = SystemClock.elapsedRealtime();
        private final Object lock = new Object();
        private boolean zzv = true;
        private int zzx = 0;

        zzb(Detector<?> detector) {
            this.zzr = detector;
        }

        final void release() {
            this.zzr.release();
            this.zzr = null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z11;
            Frame build;
            ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.lock) {
                    while (true) {
                        z11 = this.zzv;
                        if (!z11 || this.zzy != null) {
                            break;
                        }
                        try {
                            this.lock.wait();
                        } catch (InterruptedException e11) {
                            Log.d("CameraSource", "Frame processing loop terminated.", e11);
                            return;
                        }
                    }
                    if (!z11) {
                        return;
                    }
                    build = new Frame.Builder().setImageData(this.zzy, CameraSource.this.zzh.getWidth(), CameraSource.this.zzh.getHeight(), 17).setId(this.zzx).setTimestampMillis(this.zzw).setRotation(CameraSource.this.rotation).build();
                    byteBuffer = this.zzy;
                    this.zzy = null;
                }
                try {
                    this.zzr.receiveFrame(build);
                } catch (Exception e12) {
                    Log.e("CameraSource", "Exception thrown from receiver.", e12);
                } finally {
                    CameraSource.this.zzg.addCallbackBuffer(byteBuffer.array());
                }
            }
        }

        final void setActive(boolean z11) {
            synchronized (this.lock) {
                this.zzv = z11;
                this.lock.notifyAll();
            }
        }

        final void zza(byte[] bArr, Camera camera) {
            synchronized (this.lock) {
                ByteBuffer byteBuffer = this.zzy;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.zzy = null;
                }
                if (!CameraSource.this.zzq.containsKey(bArr)) {
                    Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.zzw = SystemClock.elapsedRealtime() - this.zzu;
                this.zzx++;
                this.zzy = (ByteBuffer) CameraSource.this.zzq.get(bArr);
                this.lock.notifyAll();
            }
        }
    }

    /* loaded from: classes3.dex */
    class zzc implements Camera.PictureCallback {
        private PictureCallback zzz;

        private zzc() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.zzz;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.zzf) {
                if (CameraSource.this.zzg != null) {
                    CameraSource.this.zzg.startPreview();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static class zzd implements Camera.ShutterCallback {
        private ShutterCallback zzaa;

        private zzd() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
            ShutterCallback shutterCallback = this.zzaa;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class zze {
        private Size zzab;
        private Size zzac;

        public zze(Camera.Size size, Camera.Size size2) {
            this.zzab = new Size(size.width, size.height);
            if (size2 != null) {
                this.zzac = new Size(size2.width, size2.height);
            }
        }

        public final Size zzb() {
            return this.zzab;
        }

        public final Size zzc() {
            return this.zzac;
        }
    }

    private CameraSource() {
        this.zzf = new Object();
        this.facing = 0;
        this.zzi = 30.0f;
        this.zzj = 1024;
        this.zzk = 768;
        this.zzl = false;
        this.zzq = new HashMap();
    }

    private final Camera zza() {
        int i11;
        int i12;
        int i13 = this.facing;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= Camera.getNumberOfCameras()) {
                i15 = -1;
                break;
            }
            Camera.getCameraInfo(i15, cameraInfo);
            if (cameraInfo.facing == i13) {
                break;
            }
            i15++;
        }
        if (i15 != -1) {
            Camera open = Camera.open(i15);
            int i16 = this.zzj;
            int i17 = this.zzk;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                float f11 = size.width / size.height;
                Iterator<Camera.Size> it2 = supportedPictureSizes.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Camera.Size next = it2.next();
                        if (Math.abs(f11 - (next.width / next.height)) < 0.01f) {
                            arrayList.add(new zze(size, next));
                            break;
                        }
                    }
                }
            }
            if (arrayList.size() == 0) {
                Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                for (Camera.Size size2 : supportedPreviewSizes) {
                    arrayList.add(new zze(size2, null));
                }
            }
            int size3 = arrayList.size();
            int i18 = Integer.MAX_VALUE;
            int i19 = 0;
            int i21 = Integer.MAX_VALUE;
            zze zzeVar = null;
            while (i19 < size3) {
                Object obj = arrayList.get(i19);
                i19++;
                zze zzeVar2 = (zze) obj;
                Size zzb2 = zzeVar2.zzb();
                int abs = Math.abs(zzb2.getWidth() - i16) + Math.abs(zzb2.getHeight() - i17);
                if (abs < i21) {
                    zzeVar = zzeVar2;
                    i21 = abs;
                }
            }
            if (zzeVar != null) {
                Size zzc2 = zzeVar.zzc();
                this.zzh = zzeVar.zzb();
                int i22 = (int) (this.zzi * 1000.0f);
                int[] iArr = null;
                for (int[] iArr2 : open.getParameters().getSupportedPreviewFpsRange()) {
                    int abs2 = Math.abs(i22 - iArr2[0]) + Math.abs(i22 - iArr2[1]);
                    if (abs2 < i18) {
                        iArr = iArr2;
                        i18 = abs2;
                    }
                }
                if (iArr != null) {
                    Camera.Parameters parameters2 = open.getParameters();
                    if (zzc2 != null) {
                        parameters2.setPictureSize(zzc2.getWidth(), zzc2.getHeight());
                    }
                    parameters2.setPreviewSize(this.zzh.getWidth(), this.zzh.getHeight());
                    parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                    parameters2.setPreviewFormat(17);
                    int rotation = ((WindowManager) this.zze.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i14 = 90;
                        } else if (rotation == 2) {
                            i14 = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
                        } else if (rotation != 3) {
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("Bad rotation value: ");
                            sb2.append(rotation);
                            Log.e("CameraSource", sb2.toString());
                        } else {
                            i14 = 270;
                        }
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i15, cameraInfo2);
                    if (cameraInfo2.facing == 1) {
                        i11 = (cameraInfo2.orientation + i14) % 360;
                        i12 = (360 - i11) % 360;
                    } else {
                        i11 = ((cameraInfo2.orientation - i14) + 360) % 360;
                        i12 = i11;
                    }
                    this.rotation = i11 / 90;
                    open.setDisplayOrientation(i12);
                    parameters2.setRotation(i11);
                    if (this.zzl) {
                        if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                            parameters2.setFocusMode("continuous-video");
                        } else {
                            Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                        }
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new zza());
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    public int getCameraFacing() {
        return this.facing;
    }

    public Size getPreviewSize() {
        return this.zzh;
    }

    public void release() {
        synchronized (this.zzf) {
            stop();
            this.zzp.release();
        }
    }

    public CameraSource start() {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            this.zzg = zza();
            SurfaceTexture surfaceTexture = new SurfaceTexture(100);
            this.zzm = surfaceTexture;
            this.zzg.setPreviewTexture(surfaceTexture);
            this.zzn = true;
            this.zzg.startPreview();
            Thread thread = new Thread(this.zzp);
            this.zzo = thread;
            thread.setName("gms.vision.CameraSource");
            this.zzp.setActive(true);
            this.zzo.start();
            return this;
        }
    }

    public void stop() {
        synchronized (this.zzf) {
            this.zzp.setActive(false);
            Thread thread = this.zzo;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.zzo = null;
            }
            Camera camera = this.zzg;
            if (camera != null) {
                camera.stopPreview();
                this.zzg.setPreviewCallbackWithBuffer(null);
                try {
                    if (this.zzn) {
                        this.zzg.setPreviewTexture(null);
                    } else {
                        this.zzg.setPreviewDisplay(null);
                    }
                } catch (Exception e11) {
                    String valueOf = String.valueOf(e11);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
                    sb2.append("Failed to clear camera preview: ");
                    sb2.append(valueOf);
                    Log.e("CameraSource", sb2.toString());
                }
                this.zzg.release();
                this.zzg = null;
            }
            this.zzq.clear();
        }
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                zzd zzdVar = new zzd();
                zzdVar.zzaa = shutterCallback;
                zzc zzcVar = new zzc();
                zzcVar.zzz = pictureCallback;
                this.zzg.takePicture(zzdVar, null, null, zzcVar);
            }
        }
    }

    public CameraSource start(SurfaceHolder surfaceHolder) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            Camera zza2 = zza();
            this.zzg = zza2;
            zza2.setPreviewDisplay(surfaceHolder);
            this.zzg.startPreview();
            this.zzo = new Thread(this.zzp);
            this.zzp.setActive(true);
            this.zzo.start();
            this.zzn = false;
            return this;
        }
    }

    private final byte[] zza(Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray() && wrap.array() == bArr) {
            this.zzq.put(bArr, wrap);
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }
}
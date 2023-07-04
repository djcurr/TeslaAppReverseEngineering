package com.zmxv.RNSound;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes6.dex */
public class RNSoundModule extends ReactContextBaseJavaModule implements AudioManager.OnAudioFocusChangeListener {
    static final Object NULL = null;
    String category;
    ReactApplicationContext context;
    Double focusedPlayerKey;
    Boolean mixWithOthers;
    Map<Double, MediaPlayer> playerPool;
    Boolean wasPlayingBeforeFocusChange;

    /* loaded from: classes6.dex */
    class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f22961a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callback f22962b;

        a(RNSoundModule rNSoundModule, Callback callback) {
            this.f22962b = callback;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public synchronized void onPrepared(MediaPlayer mediaPlayer) {
            if (this.f22961a) {
                return;
            }
            this.f22961a = true;
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("duration", mediaPlayer.getDuration() * 0.001d);
            try {
                this.f22962b.invoke(RNSoundModule.NULL, createMap);
            } catch (RuntimeException e11) {
                Log.e("RNSoundModule", "Exception", e11);
            }
        }
    }

    /* loaded from: classes6.dex */
    class b implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f22963a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callback f22964b;

        b(RNSoundModule rNSoundModule, Callback callback) {
            this.f22964b = callback;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public synchronized boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            if (this.f22963a) {
                return true;
            }
            this.f22963a = true;
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("what", i11);
                createMap.putInt("extra", i12);
                this.f22964b.invoke(createMap, RNSoundModule.NULL);
            } catch (RuntimeException e11) {
                Log.e("RNSoundModule", "Exception", e11);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f22965a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Double f22966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f22967c;

        c(Double d11, Callback callback) {
            this.f22966b = d11;
            this.f22967c = callback;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            if (!mediaPlayer.isLooping()) {
                RNSoundModule.this.setOnPlay(false, this.f22966b);
                if (this.f22965a) {
                    return;
                }
                this.f22965a = true;
                try {
                    this.f22967c.invoke(Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class d implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f22969a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Double f22970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f22971c;

        d(Double d11, Callback callback) {
            this.f22970b = d11;
            this.f22971c = callback;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public synchronized boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            RNSoundModule.this.setOnPlay(false, this.f22970b);
            if (this.f22969a) {
                return true;
            }
            this.f22969a = true;
            try {
                this.f22971c.invoke(Boolean.TRUE);
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public RNSoundModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.playerPool = new HashMap();
        this.mixWithOthers = Boolean.TRUE;
        this.wasPlayingBeforeFocusChange = Boolean.FALSE;
        this.context = reactApplicationContext;
        this.category = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPlay(boolean z11, Double d11) {
        ReactApplicationContext reactApplicationContext = this.context;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", z11);
        createMap.putDouble("playerKey", d11.doubleValue());
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPlayChange", createMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    protected MediaPlayer createMediaPlayer(String str) {
        int identifier = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (identifier != 0) {
            try {
                AssetFileDescriptor openRawResourceFd = this.context.getResources().openRawResourceFd(identifier);
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                return mediaPlayer;
            } catch (IOException e11) {
                Log.e("RNSoundModule", "Exception", e11);
                return null;
            }
        } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
            if (str.startsWith("asset:/")) {
                try {
                    AssetFileDescriptor openFd = this.context.getAssets().openFd(str.replace("asset:/", ""));
                    mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                    return mediaPlayer;
                } catch (IOException e12) {
                    Log.e("RNSoundModule", "Exception", e12);
                    return null;
                }
            } else if (str.startsWith("file:/")) {
                try {
                    mediaPlayer.setDataSource(str);
                    return mediaPlayer;
                } catch (IOException e13) {
                    Log.e("RNSoundModule", "Exception", e13);
                    return null;
                }
            } else {
                if (new File(str).exists()) {
                    mediaPlayer.setAudioStreamType(3);
                    Log.i("RNSoundModule", str);
                    try {
                        mediaPlayer.setDataSource(str);
                        return mediaPlayer;
                    } catch (IOException e14) {
                        Log.e("RNSoundModule", "Exception", e14);
                    }
                }
                return null;
            }
        } else {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e15) {
                Log.e("RNSoundModule", "Exception", e15);
                return null;
            }
        }
    }

    @ReactMethod
    public void enable(Boolean bool) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsAndroid", Boolean.TRUE);
        return hashMap;
    }

    @ReactMethod
    public void getCurrentTime(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer == null) {
            callback.invoke(-1, Boolean.FALSE);
        } else {
            callback.invoke(Double.valueOf(mediaPlayer.getCurrentPosition() * 0.001d), Boolean.valueOf(mediaPlayer.isPlaying()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSound";
    }

    @ReactMethod
    public void getSystemVolume(Callback callback) {
        try {
            AudioManager audioManager = (AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            callback.invoke(Float.valueOf(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)));
        } catch (Exception e11) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, -1);
            createMap.putString("message", e11.getMessage());
            callback.invoke(createMap);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i11) {
        MediaPlayer mediaPlayer;
        if (this.mixWithOthers.booleanValue() || (mediaPlayer = this.playerPool.get(this.focusedPlayerKey)) == null) {
            return;
        }
        if (i11 <= 0) {
            Boolean valueOf = Boolean.valueOf(mediaPlayer.isPlaying());
            this.wasPlayingBeforeFocusChange = valueOf;
            if (valueOf.booleanValue()) {
                pause(this.focusedPlayerKey, null);
            }
        } else if (this.wasPlayingBeforeFocusChange.booleanValue()) {
            play(this.focusedPlayerKey, null);
            this.wasPlayingBeforeFocusChange = Boolean.FALSE;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Iterator<Map.Entry<Double, MediaPlayer>> it2 = this.playerPool.entrySet().iterator();
        while (it2.hasNext()) {
            MediaPlayer value = it2.next().getValue();
            if (value != null) {
                value.reset();
                value.release();
            }
            it2.remove();
        }
    }

    @ReactMethod
    public void pause(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    @ReactMethod
    public void play(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer == null) {
            setOnPlay(false, d11);
            if (callback != null) {
                callback.invoke(Boolean.FALSE);
            }
        } else if (mediaPlayer.isPlaying()) {
        } else {
            if (!this.mixWithOthers.booleanValue()) {
                ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).requestAudioFocus(this, 3, 1);
                this.focusedPlayerKey = d11;
            }
            mediaPlayer.setOnCompletionListener(new c(d11, callback));
            mediaPlayer.setOnErrorListener(new d(d11, callback));
            mediaPlayer.start();
            setOnPlay(true, d11);
        }
    }

    @ReactMethod
    public void prepare(String str, Double d11, ReadableMap readableMap, Callback callback) {
        MediaPlayer createMediaPlayer = createMediaPlayer(str);
        if (readableMap.hasKey("speed") && Build.VERSION.SDK_INT >= 23) {
            createMediaPlayer.setPlaybackParams(createMediaPlayer.getPlaybackParams().setSpeed((float) readableMap.getDouble("speed")));
        }
        char c11 = 65535;
        if (createMediaPlayer == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, -1);
            createMap.putString("message", "resource not found");
            callback.invoke(createMap, NULL);
            return;
        }
        this.playerPool.put(d11, createMediaPlayer);
        String str2 = this.category;
        if (str2 != null) {
            Integer num = null;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1803461041:
                    if (str2.equals("System")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 2547280:
                    if (str2.equals("Ring")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 63343153:
                    if (str2.equals("Alarm")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 82833682:
                    if (str2.equals("Voice")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 772508280:
                    if (str2.equals("Ambient")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1943812667:
                    if (str2.equals("Playback")) {
                        c11 = 5;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 2;
                    break;
                case 2:
                    num = 4;
                    break;
                case 3:
                    num = 0;
                    break;
                case 4:
                    num = 5;
                    break;
                case 5:
                    num = 3;
                    break;
                default:
                    Log.e("RNSoundModule", String.format("Unrecognised category %s", this.category));
                    break;
            }
            if (num != null) {
                createMediaPlayer.setAudioStreamType(num.intValue());
            }
        }
        createMediaPlayer.setOnPreparedListener(new a(this, callback));
        createMediaPlayer.setOnErrorListener(new b(this, callback));
        try {
            if (readableMap.hasKey("loadSync") && readableMap.getBoolean("loadSync")) {
                createMediaPlayer.prepare();
            } else {
                createMediaPlayer.prepareAsync();
            }
        } catch (Exception e11) {
            Log.e("RNSoundModule", "Exception", e11);
        }
    }

    @ReactMethod
    public void release(Double d11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.playerPool.remove(d11);
            if (this.mixWithOthers.booleanValue() || d11 != this.focusedPlayerKey) {
                return;
            }
            ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void reset(Double d11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @ReactMethod
    public void setCategory(String str, Boolean bool) {
        this.category = str;
        this.mixWithOthers = bool;
    }

    @ReactMethod
    public void setCurrentTime(Double d11, Float f11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(Math.round(f11.floatValue() * 1000.0f));
        }
    }

    @ReactMethod
    public void setLooping(Double d11, Boolean bool) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setPitch(Double d11, Float f11) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("RNSoundModule", "setPitch ignored due to sdk limit");
            return;
        }
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setPitch(f11.floatValue()));
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(Double d11, Boolean bool) {
        if (this.playerPool.get(d11) != null) {
            AudioManager audioManager = (AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (bool.booleanValue()) {
                audioManager.setMode(3);
            } else {
                audioManager.setMode(0);
            }
            audioManager.setSpeakerphoneOn(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setSpeed(Double d11, Float f11) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("RNSoundModule", "setSpeed ignored due to sdk limit");
            return;
        }
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f11.floatValue()));
        }
    }

    @ReactMethod
    public void setSystemVolume(Float f11) {
        AudioManager audioManager = (AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.setStreamVolume(3, Math.round(audioManager.getStreamMaxVolume(3) * f11.floatValue()), 0);
    }

    @ReactMethod
    public void setVolume(Double d11, Float f11, Float f12) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f11.floatValue(), f12.floatValue());
        }
    }

    @ReactMethod
    public void stop(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        if (!this.mixWithOthers.booleanValue() && d11 == this.focusedPlayerKey) {
            ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
        }
        callback.invoke(new Object[0]);
    }
}
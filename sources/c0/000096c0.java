package org.godotengine.godot;

import al.b;
import al.d;
import al.e;
import al.f;
import al.h;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import javax.microedition.khronos.opengles.GL10;
import org.godotengine.godot.input.GodotEditText;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.GodotPluginRegistry;
import org.godotengine.godot.utils.GodotNetUtils;
import org.godotengine.godot.utils.PermissionsUtil;
import org.godotengine.godot.xr.XRMode;

/* loaded from: classes5.dex */
public class Godot extends Fragment implements f {
    static final int MAX_SINGLETONS = 64;

    /* renamed from: io */
    public static GodotIO f43235io;
    private static Intent mCurrentIntent;
    public static GodotNetUtils netUtils;
    static int singleton_count;
    static SingletonBase[] singletons = new SingletonBase[64];
    private boolean activityResumed;
    private String[] command_line;
    private ViewGroup containerLayout;
    String expansion_pack_path;
    private TextView mAverageSpeed;
    private View mCellMessage;
    private ClipboardManager mClipboard;
    private View mDashboard;
    private h mDownloaderClientStub;
    private ProgressBar mPB;
    private Button mPauseButton;
    private TextView mProgressFraction;
    private TextView mProgressPercent;
    private int mState;
    private boolean mStatePaused;
    private TextView mStatusText;
    private TextView mTimeRemaining;
    public GodotView mView;
    private Button mWiFiSettingsButton;
    private GodotPluginRegistry pluginRegistry;
    public ResultCallback result_callback;
    private boolean use_apk_expansion;
    private XRMode xrMode = XRMode.REGULAR;
    private boolean use_32_bits = false;
    private boolean use_immersive = false;
    private boolean use_debug_opengl = false;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private boolean godot_initialized = false;

    /* loaded from: classes5.dex */
    public interface ResultCallback {
        void callback(int i11, int i12, Intent intent);
    }

    /* loaded from: classes5.dex */
    public static class SingletonBase {
        public void onGLDrawFrame(GL10 gl10) {
        }

        public void onGLSurfaceChanged(GL10 gl10, int i11, int i12) {
        }

        protected void onMainActivityResult(int i11, int i12, Intent intent) {
        }

        protected boolean onMainBackPressed() {
            return false;
        }

        protected View onMainCreateView(Activity activity) {
            return null;
        }

        protected void onMainDestroy() {
        }

        protected void onMainPause() {
        }

        protected void onMainRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        }

        protected void onMainResume() {
        }

        protected void registerClass(String str, String[] strArr) {
            Method[] declaredMethods;
            boolean z11;
            GodotPlugin.nativeRegisterSingleton(str, this);
            for (Method method : getClass().getDeclaredMethods()) {
                int length = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        break;
                    } else if (strArr[i11].equals(method.getName())) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> cls : method.getParameterTypes()) {
                        arrayList.add(cls.getName());
                    }
                    String[] strArr2 = new String[arrayList.size()];
                    arrayList.toArray(strArr2);
                    GodotPlugin.nativeRegisterMethod(str, method.getName(), method.getReturnType().getName(), strArr2);
                }
            }
            SingletonBase[] singletonBaseArr = Godot.singletons;
            int i12 = Godot.singleton_count;
            Godot.singleton_count = i12 + 1;
            singletonBaseArr[i12] = this;
        }

        public void registerMethods() {
        }
    }

    private void forceQuit() {
        System.exit(0);
    }

    public static Intent getCurrentIntent() {
        return mCurrentIntent;
    }

    @Keep
    private String getInputFallbackMapping() {
        return this.xrMode.inputFallbackMapping;
    }

    @Keep
    private Surface getSurface() {
        return this.mView.getHolder().getSurface();
    }

    private void initializeGodot() {
        String[] strArr;
        if (this.expansion_pack_path != null) {
            String[] strArr2 = this.command_line;
            int i11 = 0;
            if (strArr2 != null) {
                strArr = new String[strArr2.length + 2];
                int length = strArr2.length;
                while (true) {
                    String[] strArr3 = this.command_line;
                    if (i11 >= strArr3.length) {
                        break;
                    }
                    strArr[i11] = strArr3[i11];
                    i11++;
                }
                i11 = length;
            } else {
                strArr = new String[2];
            }
            strArr[i11] = "--main-pack";
            strArr[i11 + 1] = this.expansion_pack_path;
            this.command_line = strArr;
        }
        androidx.fragment.app.h activity = getActivity();
        f43235io = new GodotIO(activity);
        GodotIO.unique_id = Settings.Secure.getString(activity.getContentResolver(), "android_id");
        GodotLib.f43238io = f43235io;
        netUtils = new GodotNetUtils(activity);
        GodotLib.initialize(activity, this, activity.getAssets(), this.use_apk_expansion);
        this.result_callback = null;
        this.godot_initialized = true;
    }

    @Keep
    private boolean isActivityResumed() {
        return this.activityResumed;
    }

    private boolean obbIsCorrupted(String str, String str2) {
        int read;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[16384];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            do {
                read = fileInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            return !stringBuffer.toString().equals(str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Keep
    private void onVideoInit() {
        boolean z11 = getGLESVersionCode() >= 196608;
        final androidx.fragment.app.h activity = getActivity();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.containerLayout = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        GodotEditText godotEditText = new GodotEditText(activity);
        godotEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) getResources().getDimension(R.dimen.text_edit_height)));
        this.containerLayout.addView(godotEditText);
        GodotView godotView = new GodotView(activity, this, this.xrMode, z11, this.use_32_bits, this.use_debug_opengl);
        this.mView = godotView;
        this.containerLayout.addView(godotView, new ViewGroup.LayoutParams(-1, -1));
        godotEditText.setView(this.mView);
        f43235io.setEdit(godotEditText);
        this.mView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.godotengine.godot.Godot.1
            {
                Godot.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Point point = new Point();
                activity.getWindowManager().getDefaultDisplay().getSize(point);
                Rect rect = new Rect();
                Godot.this.mView.getWindowVisibleDisplayFrame(rect);
                GodotLib.setVirtualKeyboardHeight(point.y - rect.bottom);
            }
        });
        final String[] strArr = this.command_line;
        this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.2
            {
                Godot.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                GodotLib.setup(strArr);
                for (GodotPlugin godotPlugin : Godot.this.pluginRegistry.getAllPlugins()) {
                    godotPlugin.onRegisterPluginWithGodotNative();
                }
                Godot.this.setKeepScreenOn("True".equals(GodotLib.getGlobal("display/window/energy_saving/keep_screen_on")));
                Godot.this.mainThreadHandler.post(new Runnable() { // from class: org.godotengine.godot.Godot.2.1
                    {
                        AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        for (int i11 = 0; i11 < Godot.singleton_count; i11++) {
                            View onMainCreateView = Godot.singletons[i11].onMainCreateView(activity);
                            if (onMainCreateView != null) {
                                Godot.this.containerLayout.addView(onMainCreateView);
                            }
                        }
                    }
                });
            }
        });
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            View onMainCreate = godotPlugin.onMainCreate(activity);
            if (onMainCreate != null) {
                this.containerLayout.addView(onMainCreate);
            }
        }
    }

    private void setButtonPausedState(boolean z11) {
        this.mStatePaused = z11;
        this.mPauseButton.setText(z11 ? R.string.text_button_resume : R.string.text_button_pause);
    }

    private void setState(int i11) {
        if (this.mState != i11) {
            this.mState = i11;
            this.mStatusText.setText(e.e(i11));
        }
    }

    @Keep
    private void vibrate(int i11) {
        Vibrator vibrator;
        if (!requestPermission("VIBRATE") || (vibrator = (Vibrator) getContext().getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(i11, -1));
        } else {
            vibrator.vibrate(i11);
        }
    }

    public void UiChangeListener() {
        final View decorView = getActivity().getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: org.godotengine.godot.Godot.5
            {
                Godot.this = this;
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i11) {
                if ((i11 & 4) != 0 || Build.VERSION.SDK_INT < 19) {
                    return;
                }
                decorView.setSystemUiVisibility(5894);
            }
        });
    }

    public void alert(final String str, final String str2) {
        final androidx.fragment.app.h activity = getActivity();
        runOnUiThread(new Runnable() { // from class: org.godotengine.godot.Godot.4
            {
                Godot.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(str).setTitle(str2);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: org.godotengine.godot.Godot.4.1
                    {
                        AnonymousClass4.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
    }

    public String getClipboard() {
        return this.mClipboard.getPrimaryClip() != null ? this.mClipboard.getPrimaryClip().getItemAt(0).getText().toString() : "";
    }

    protected String[] getCommandLine() {
        try {
            InputStream open = getActivity().getAssets().open("_cl_");
            byte[] bArr = new byte[4];
            if (open.read(bArr) < 4) {
                return new String[0];
            }
            int i11 = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
            String[] strArr = new String[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                if (open.read(bArr) < 4) {
                    return new String[0];
                }
                int i13 = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
                if (i13 > 65535) {
                    return new String[0];
                }
                byte[] bArr2 = new byte[i13];
                if (open.read(bArr2) == i13) {
                    strArr[i12] = new String(bArr2, "UTF-8");
                }
            }
            return strArr;
        } catch (Exception e11) {
            e11.printStackTrace();
            return new String[0];
        }
    }

    public int getGLESVersionCode() {
        return ((ActivityManager) getContext().getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
    }

    public String[] getGrantedPermissions() {
        return PermissionsUtil.getGrantedPermissions(getActivity());
    }

    public boolean gotTouchEvent(MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        if (pointerCount != 0 && this.mView != null) {
            final int[] iArr = new int[motionEvent.getPointerCount() * 3];
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                int i12 = i11 * 3;
                iArr[i12 + 0] = motionEvent.getPointerId(i11);
                iArr[i12 + 1] = (int) motionEvent.getX(i11);
                iArr[i12 + 2] = (int) motionEvent.getY(i11);
            }
            final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            final int action = motionEvent.getAction() & 255;
            this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.7
                {
                    Godot.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    int i13 = action;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                GodotLib.touch(1, 0, pointerCount, iArr);
                                return;
                            } else if (i13 != 3) {
                                if (i13 == 5) {
                                    GodotLib.touch(3, pointerId, pointerCount, iArr);
                                    return;
                                } else if (i13 != 6) {
                                    return;
                                } else {
                                    GodotLib.touch(4, pointerId, pointerCount, iArr);
                                    return;
                                }
                            }
                        }
                        GodotLib.touch(2, 0, pointerCount, iArr);
                        return;
                    }
                    GodotLib.touch(0, 0, pointerCount, iArr);
                }
            });
        }
        return true;
    }

    public void initInputDevices() {
        this.mView.initInputDevices();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        ResultCallback resultCallback = this.result_callback;
        if (resultCallback != null) {
            resultCallback.callback(i11, i12, intent);
            this.result_callback = null;
        }
        for (int i13 = 0; i13 < singleton_count; i13++) {
            singletons[i13].onMainActivityResult(i11, i12, intent);
        }
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            godotPlugin.onMainActivityResult(i11, i12, intent);
        }
    }

    public void onBackPressed() {
        GodotView godotView;
        boolean z11 = true;
        for (int i11 = 0; i11 < singleton_count; i11++) {
            if (singletons[i11].onMainBackPressed()) {
                z11 = false;
            }
        }
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            if (godotPlugin.onMainBackPressed()) {
                z11 = false;
            }
        }
        if (!z11 || (godotView = this.mView) == null) {
            return;
        }
        godotView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.6
            {
                Godot.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                GodotLib.back();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x018b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.godotengine.godot.Godot.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        for (int i11 = 0; i11 < singleton_count; i11++) {
            singletons[i11].onMainDestroy();
        }
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            godotPlugin.onMainDestroy();
        }
        GodotLib.ondestroy();
        super.onDestroy();
        forceQuit();
    }

    @Override // al.f
    public void onDownloadProgress(b bVar) {
        this.mAverageSpeed.setText(getString(R.string.kilobytes_per_second, e.h(bVar.f556d)));
        this.mTimeRemaining.setText(getString(R.string.time_remaining, e.i(bVar.f555c)));
        this.mPB.setMax((int) (bVar.f553a >> 8));
        this.mPB.setProgress((int) (bVar.f554b >> 8));
        this.mProgressPercent.setText(String.format(Locale.ENGLISH, "%d %%", Long.valueOf((bVar.f554b * 100) / bVar.f553a)));
        this.mProgressFraction.setText(e.d(bVar.f554b, bVar.f553a));
    }

    @Override // al.f
    public void onDownloadStateChanged(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        setState(i11);
        boolean z14 = true;
        switch (i11) {
            case 1:
            case 2:
            case 3:
                z11 = false;
                z12 = false;
                z13 = true;
                break;
            case 4:
                z11 = false;
                z12 = false;
                z13 = z12;
                break;
            case 5:
                initializeGodot();
                return;
            case 6:
            case 10:
            case 11:
            case 13:
            case 17:
            default:
                z11 = false;
                z12 = true;
                z13 = z12;
                break;
            case 7:
            case 12:
            case 14:
                z11 = false;
                z13 = false;
                z12 = true;
                break;
            case 8:
            case 9:
                z13 = false;
                z11 = true;
                z12 = true;
                z14 = z13;
                break;
            case 15:
            case 16:
            case 18:
            case 19:
                z11 = false;
                z13 = false;
                z12 = true;
                z14 = z13;
                break;
        }
        int i12 = z14 ? 0 : 8;
        if (this.mDashboard.getVisibility() != i12) {
            this.mDashboard.setVisibility(i12);
        }
        int i13 = z11 ? 0 : 8;
        if (this.mCellMessage.getVisibility() != i13) {
            this.mCellMessage.setVisibility(i13);
        }
        this.mPB.setIndeterminate(z13);
        setButtonPausedState(z12);
    }

    public void onGodotMainLoopStarted() {
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            godotPlugin.onGodotMainLoopStarted();
        }
    }

    public boolean onKeyMultiple(int i11, int i12, KeyEvent keyEvent) {
        String characters = keyEvent.getCharacters();
        if (characters == null || characters.length() == 0) {
            return false;
        }
        final char[] charArray = characters.toCharArray();
        int length = charArray.length;
        int i13 = 0;
        while (true) {
            length--;
            int i14 = 1;
            if (length < 0) {
                break;
            }
            if (charArray[length] == 0) {
                i14 = 0;
            }
            i13 += i14;
        }
        if (i13 == 0) {
            return false;
        }
        this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.8
            {
                Godot.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                int length2 = charArray.length;
                for (int i15 = 0; i15 < length2; i15++) {
                    char c11 = charArray[i15];
                    if (c11 != 0) {
                        GodotLib.key(0, c11, true);
                        GodotLib.key(0, c11, false);
                    }
                }
            }
        });
        return true;
    }

    public void onNewIntent(Intent intent) {
        mCurrentIntent = intent;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.activityResumed = false;
        if (!this.godot_initialized) {
            h hVar = this.mDownloaderClientStub;
            if (hVar != null) {
                hVar.c(getActivity());
                return;
            }
            return;
        }
        this.mView.onPause();
        for (int i11 = 0; i11 < singleton_count; i11++) {
            singletons[i11].onMainPause();
        }
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            godotPlugin.onMainPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        for (int i12 = 0; i12 < singleton_count; i12++) {
            singletons[i12].onMainRequestPermissionsResult(i11, strArr, iArr);
        }
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            godotPlugin.onMainRequestPermissionsResult(i11, strArr, iArr);
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            GodotLib.requestPermissionResult(strArr[i13], iArr[i13] == 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.activityResumed = true;
        if (!this.godot_initialized) {
            h hVar = this.mDownloaderClientStub;
            if (hVar != null) {
                hVar.a(getActivity());
                return;
            }
            return;
        }
        this.mView.onResume();
        if (this.use_immersive && Build.VERSION.SDK_INT >= 19) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        for (int i11 = 0; i11 < singleton_count; i11++) {
            singletons[i11].onMainResume();
        }
        for (GodotPlugin godotPlugin : this.pluginRegistry.getAllPlugins()) {
            godotPlugin.onMainResume();
        }
    }

    @Override // al.f
    public void onServiceConnected(Messenger messenger) {
        d.a(messenger).onClientUpdated(this.mDownloaderClientStub.b());
    }

    public boolean requestPermission(String str) {
        return PermissionsUtil.requestPermission(str, getActivity());
    }

    public boolean requestPermissions() {
        return PermissionsUtil.requestManifestPermissions(getActivity());
    }

    public void restart() {
        androidx.fragment.app.h activity = getActivity();
        if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("intent", mCurrentIntent);
            activity.startInstrumentation(new ComponentName(activity, GodotInstrumentation.class), null, bundle);
        }
    }

    public final void runOnRenderThread(Runnable runnable) {
        GodotView godotView = this.mView;
        if (godotView != null) {
            godotView.queueEvent(runnable);
        }
    }

    public final void runOnUiThread(Runnable runnable) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(runnable);
        }
    }

    public void setClipboard(String str) {
        this.mClipboard.setPrimaryClip(ClipData.newPlainText("myLabel", str));
    }

    public void setKeepScreenOn(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: org.godotengine.godot.Godot.3
            {
                Godot.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (z11) {
                    Godot.this.getActivity().getWindow().addFlags(128);
                } else {
                    Godot.this.getActivity().getWindow().clearFlags(128);
                }
            }
        });
    }
}
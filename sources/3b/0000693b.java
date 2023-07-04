package expo.modules.core.interfaces;

/* loaded from: classes5.dex */
public interface RuntimeEnvironmentInterface {

    /* loaded from: classes5.dex */
    public interface PlatformVersion {
        int major();

        int minor();

        int patch();

        String prerelease();
    }

    String platformName();

    PlatformVersion platformVersion();
}
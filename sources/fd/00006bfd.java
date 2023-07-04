package expo.modules.webbrowser.error;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class NoPreferredPackageFound extends CodedException {
    public NoPreferredPackageFound(String str) {
        super(str);
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "PREFERRED_PACKAGE_NOT_FOUND";
    }
}
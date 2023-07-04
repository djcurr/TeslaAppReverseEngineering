package expo.modules.webbrowser.error;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class PackageManagerNotFoundException extends CodedException {
    public PackageManagerNotFoundException() {
        super("Package Manager not found!");
    }
}
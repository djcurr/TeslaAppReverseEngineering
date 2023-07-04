package expo.modules.location.exceptions;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class LocationSettingsUnsatisfiedException extends CodedException {
    public LocationSettingsUnsatisfiedException() {
        super("Location request failed due to unsatisfied device settings.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_LOCATION_SETTINGS_UNSATISFIED";
    }
}
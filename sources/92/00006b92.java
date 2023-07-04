package expo.modules.location.exceptions;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class LocationUnavailableException extends CodedException {
    public LocationUnavailableException() {
        super("Location is unavailable. Make sure that location services are enabled.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_LOCATION_UNAVAILABLE";
    }
}
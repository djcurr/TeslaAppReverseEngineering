package expo.modules.location.exceptions;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class LocationBackgroundUnauthorizedException extends CodedException {
    public LocationBackgroundUnauthorizedException() {
        super("Not authorized to use background location services.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_LOCATION_BACKGROUND_UNAUTHORIZED";
    }
}
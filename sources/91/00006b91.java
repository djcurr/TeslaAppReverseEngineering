package expo.modules.location.exceptions;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class LocationUnauthorizedException extends CodedException {
    public LocationUnauthorizedException() {
        super("Not authorized to use location services.");
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_LOCATION_UNAUTHORIZED";
    }
}
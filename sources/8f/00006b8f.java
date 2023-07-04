package expo.modules.location.exceptions;

import expo.modules.core.errors.CodedException;

/* loaded from: classes5.dex */
public class LocationRequestRejectedException extends CodedException {
    public LocationRequestRejectedException(Exception exc) {
        super("Location request has been rejected: " + exc.getMessage());
    }

    @Override // expo.modules.core.errors.CodedException, expo.modules.core.interfaces.CodedThrowable
    public String getCode() {
        return "E_LOCATION_REQUEST_REJECTED";
    }
}
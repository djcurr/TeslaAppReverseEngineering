package com.tesla.data.oapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes6.dex */
public enum f {
    OWNERAPI_ERROR_UNAUTHORIZED("UNAUTHORIZED"),
    OWNERAPI_ERROR_NOT_FOUND("NOT_FOUND"),
    OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED("MOBILE_ACCESS_DISABLED"),
    OWNERAPI_ERROR_VEHICLE_IN_SERVICE("VEHICLE_IN_SERVICE"),
    OWNERAPI_ERROR_TIMEOUT("OWNER_API_TIMEOUT"),
    OWNERAPI_ERROR_ACCOUNT_LOCKED("ACCOUNT_LOCKED"),
    OWNERAPI_ERROR_TOO_MANY_REQUESTS("TOO_MANY_REQUESTS"),
    OWNERAPI_ERROR_SERVER_ERROR("SERVER_ERROR"),
    OWNERAPI_ERROR_SERVER_SYSTEM_WIDE_ERROR("SERVER_SYSTEM_WIDE_ERROR"),
    OWNERAPI_ERROR_VEHICLE_SPECIFIC_ERROR("VEHICLE_SPECIFIC_ERROR"),
    OWNERAPI_ERROR_SERVICE_MAINTENANCE("SERVICE_MAINTENANCE"),
    OWNERAPI_ERROR_EMPTY_RESPONSE("EMPTY_RESPONSE"),
    OWNERAPI_ERROR_BAD_RESPONSE("BAD_RESPONSE"),
    OWNERAPI_ERROR_BACKEND_DEPENDENCY_OR_MISSING_DATA("BACKEND_DEPENDENCY_FAILURE_OR_MISSING_DATA"),
    OWNERAPI_ERROR_GATEWAY_TIMEOUT("GATEWAY_TIMEOUT"),
    OWNERAPI_ERROR_UNPROCESSABLE_ENTITY("UNPROCESSABLE_ENTITY"),
    OWNERAPI_ERROR_UNKNOWN_ERROR("UNKNOWN_ERROR");
    
    public static final HashSet<String> UnrecoverableErrorStrings;
    public static final HashSet<f> UnrecoverableErrors;
    static final HashMap<String, f> errorStringMap = new HashMap<>();
    private final String errorString;

    static {
        f[] values;
        for (f fVar : values()) {
            errorStringMap.put(fVar.errorString, fVar);
        }
        f fVar2 = OWNERAPI_ERROR_UNAUTHORIZED;
        f fVar3 = OWNERAPI_ERROR_ACCOUNT_LOCKED;
        f fVar4 = OWNERAPI_ERROR_SERVICE_MAINTENANCE;
        f fVar5 = OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED;
        f fVar6 = OWNERAPI_ERROR_NOT_FOUND;
        f fVar7 = OWNERAPI_ERROR_TOO_MANY_REQUESTS;
        UnrecoverableErrors = new HashSet<>(Arrays.asList(fVar2, fVar3, fVar4, fVar5, fVar6, fVar7));
        UnrecoverableErrorStrings = new HashSet<>(Arrays.asList(fVar2.getErrorString(), fVar3.getErrorString(), fVar4.getErrorString(), fVar5.getErrorString(), fVar6.getErrorString(), fVar7.getErrorString()));
    }

    f(String str) {
        this.errorString = str;
    }

    public static f fromString(String str) {
        HashMap<String, f> hashMap = errorStringMap;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        return OWNERAPI_ERROR_UNKNOWN_ERROR;
    }

    public static f getOwnerAPIError(int i11) {
        if (isUnauthorized(i11)) {
            return OWNERAPI_ERROR_UNAUTHORIZED;
        }
        if (i11 == 404) {
            return OWNERAPI_ERROR_NOT_FOUND;
        }
        if (i11 == 405) {
            return OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED;
        }
        if (i11 == 408) {
            return OWNERAPI_ERROR_TIMEOUT;
        }
        if (i11 == 412) {
            return OWNERAPI_ERROR_BACKEND_DEPENDENCY_OR_MISSING_DATA;
        }
        if (i11 == 422) {
            return OWNERAPI_ERROR_UNPROCESSABLE_ENTITY;
        }
        if (i11 == 423) {
            return OWNERAPI_ERROR_ACCOUNT_LOCKED;
        }
        if (i11 == 429) {
            return OWNERAPI_ERROR_TOO_MANY_REQUESTS;
        }
        if (i11 == 500) {
            return OWNERAPI_ERROR_SERVER_ERROR;
        }
        if (i11 == 502) {
            return OWNERAPI_ERROR_SERVER_SYSTEM_WIDE_ERROR;
        }
        if (i11 == 503) {
            return OWNERAPI_ERROR_SERVICE_MAINTENANCE;
        }
        if (i11 == 504) {
            return OWNERAPI_ERROR_GATEWAY_TIMEOUT;
        }
        if (i11 == 540) {
            return OWNERAPI_ERROR_VEHICLE_SPECIFIC_ERROR;
        }
        if (i11 > 299) {
            return OWNERAPI_ERROR_UNKNOWN_ERROR;
        }
        return null;
    }

    public static boolean isUnauthorized(int i11) {
        return i11 == 401;
    }

    public String getErrorString() {
        return this.errorString;
    }
}
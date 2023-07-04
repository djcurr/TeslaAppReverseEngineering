package nv;

import expo.modules.contacts.EXColumns;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public enum c {
    SetVin,
    SetAccountEmail,
    ScanForPeripherals,
    ClearPeripherals,
    ResetCommandPeripheral,
    RequestMTU,
    AddToWhitelist,
    CancelExternalAuthenticate,
    RemoveFromWhitelist,
    GetEpochSessionInfo,
    GetTokenForKey,
    SendBLEData,
    ReceivedBLEData,
    SendBLEDataLegacy,
    GetWhiteslistUpdate,
    GetStatus,
    StartMonitoringRSSI,
    StopMonitoringRSSI,
    SetConnectionBehaviorWhenUnauthorized,
    SendReportServiceRequest,
    AuthResponse,
    SendNullAuthResponse,
    UnlockCar,
    LockCar,
    OpenTrunk,
    OpenFrunk,
    OpenDoor,
    CloseDoor,
    OpenAllDoors,
    CloseDoorsAndLock,
    OpenChargePort,
    CloseChargePort,
    ScanForPeripheralsResult,
    ClearPeripheralsResult,
    CommandResult,
    VehicleStatusMessage,
    VehicleEventMessage,
    SetEventSubscriptionsReady,
    Register,
    Unregister,
    RegisterComplete,
    PromoteServiceToForeground,
    NFCGetPublicKeyBytes,
    NFCGetPublicKeyBytesInfo,
    NFCEncryptWithSharedSecret,
    NFCEncryptWithSharedSecretResponse,
    NFCProtoMessage,
    SwitchProductMessage,
    WidgetFetchStatus,
    UpdateBackgroundServicePermission;
    
    private static final String key = "data";
    private static final Map<Integer, c> lookup = new HashMap();

    static {
        Iterator it2 = EnumSet.allOf(c.class).iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            lookup.put(Integer.valueOf(cVar.ordinal()), cVar);
        }
    }

    public static c get(int i11) {
        return lookup.get(Integer.valueOf(i11));
    }

    public static String getName(int i11) {
        String format = String.format("Unknown - [%d]", Integer.valueOf(i11));
        c cVar = get(i11);
        return cVar != null ? cVar.name() : format;
    }

    public String getKey() {
        return "data";
    }

    public String getKey2() {
        return EXColumns.TYPE;
    }

    public int getWhat() {
        return ordinal();
    }
}
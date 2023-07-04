# 80/00000e80.java
## Check possible operations for vehicle
```java
package bv;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import lt.t0;
import lt.w2;
import mt.k;
import vz.p;
import wz.w;

public final class Operations {

    // Enum index mapping
    public /* synthetic */ class EnumIndexMap {
        public static final int[] enumIndices;

        static {
            enumIndices = new int[ControlOperation.values().length];
            for (ControlOperation operation : ControlOperation.values()) {
                enumIndices[operation.ordinal()] = operation.ordinal() + 1;
            }
        }
    }

    // Method checks certain conditions
    private static final boolean checkConditions(cu.a vehicleInstance) {
        // Implementation removed for brevity
        return true;
    }

    // Returns a specific control operation based on vehicle conditions
    public static final ot.c getControlOperation(ControlOperation operation, cu.a vehicle) {
        s.g(operation, "<this>");
        s.g(vehicle, "vehicle");

        // If we cannot apply the control operation, return null
        if (!canApplyControlOperation(operation, vehicle)) {
            return null;
        }

        ot.d sourceWidget = ot.d.SOURCE_WIDGET;
        boolean operationState = com.tesla.widget.c.isOperationActive(operation, vehicle);
        String vehicleId = vehicle.getVehicleId();
        boolean specialCondition = false;

        switch (EnumIndexMap.enumIndices[operation.ordinal()]) {
            // Specific cases removed for brevity
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    // Checks if a specific control operation can be applied to a vehicle
    public static final boolean canApplyControlOperation(ControlOperation operation, cu.a appVehicle) {
        s.g(operation, "<this>");
        s.g(appVehicle, "appVehicle");

        w2 vehicleInfo = appVehicle.getVehicleInfo();

        if (vehicleInfo == null) {
            return false;
        }

        int operationIndex = EnumIndexMap.enumIndices[operation.ordinal()];

        // Checking various cases based on operation type
        // The actual condition checks have been omitted for brevity and replaced with placeholders

        // Specific cases removed for brevity

        return true;
    }
}
```
# db/0000bfdb.java
## factory class for generating various vehicle commands
```java

public final class VehicleCommandRequestFactory {

    public static final VehicleCommandRequestFactory instance = new VehicleCommandRequestFactory();
    private static TransportList transportList;

    private VehicleCommandRequestFactory() {
    }

    // List of other command functions skipped for brevity...

    private final List<m> getTransports(String str) {
        Map logData;
        List<m> transports;
        TransportList transportList = this.transportList;
        if (transportList == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            logData = teslaLog.log("VehicleCommandRequestFactory", "Missing call to initialize. Cannot get transports for command. Defaulting to BLE & OAPI.");
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : logData.entrySet()) {
                teslaLog.logData((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Missing call to initialize. Cannot get transports for command. Defaulting to BLE & OAPI."));
            teslaLog.setTag("VehicleCommandRequestFactory");
            teslaLog.log("Missing call to initialize. Cannot get transports for command. Defaulting to BLE & OAPI.", new Object[0]);
            transports = w.l(m.TRANSPORT_BLUETOOTH, m.TRANSPORT_OWNER_API);
            return transports;
        }
        s.e(transportList);
        return transportList.getTransports(str);
    }

    public final c openClosure(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        c commandTemplate = uu.b.f53671a.b();
        List<m> transports = getTransports(vehicleId);
        e0 openType = e0.CLOSURE_MOVE_TYPE_OPEN;
        return c.b(commandTemplate, null, vehicleId, transports, source, null, false, false, new ot.b(null, null, new d0(openType, openType, openType, openType, null, null, null, null, 240, null), null, null, null, null, null, null, 507, null), null, 369, null);
    }

    // more command functions...

}
```
# 0000a6e1
## Create command requests
```java
public final class CommandRequest extends com.squareup.wire.Message<CommandRequest, CommandRequest.Builder> {

    public static final ProtoAdapter<CommandRequest> ADAPTER;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String id;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String vehicleId;
    @q(adapter = "com.tesla.generated.commandcenter.CommandRequestSource#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)
    private final d source;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 6)
    private final boolean letSleep;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 7)
    private final boolean bypassCounter;
    @q(adapter = "com.tesla.generated.commandcenter.CommandAction#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)
    private final ot.b action;
    @q(adapter = "com.tesla.generated.commandcenter.Transport#ADAPTER", label = q.a.REPEATED, tag = 3)
    private final List<Transport> transports;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    private final Map<String, String> oapiHeaders;

    public static final class Builder extends com.squareup.wire.Message.Builder<CommandRequest, Builder> {
        private Builder() {
            super(CommandRequest.ADAPTER);
        }

        public Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Builder id(String id) {
            s.g(id, "id");
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.a(id);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder vehicleId(String vehicleId) {
            s.g(vehicleId, "vehicleId");
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.b(vehicleId);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder source(CommandRequestSource source) {
            s.g(source, "source");
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.c(source);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder letSleep(boolean letSleep) {
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.a(letSleep);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder bypassCounter(boolean bypassCounter) {
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.b(bypassCounter);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder action(CommandAction action) {
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.a(action);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder addTransports(Transport transport) {
            s.g(transport, "transport");
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.a(transport);
                this.message = commandRequest;
            }
            return this;
        }

        public Builder oapiHeaders(Map<String, String> oapiHeaders) {
            s.g(oapiHeaders, "oapiHeaders");
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                commandRequest = commandRequest.a(oapiHeaders);
                this.message = commandRequest;
            }
            return this;
        }

        public CommandRequest build() {
            CommandRequest commandRequest = this.message;
            if (commandRequest != null) {
                return commandRequest;
            }
            throw new IllegalStateException("Property \"id\" has not been set");
        }
    }

    static {
        new Builder(null);
        ADAPTER = new ProtoAdapter<>(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(CommandRequest.class), o.PROTO_3);
    }

    public CommandRequest(String id, String vehicleId, List<? extends Transport> transports, CommandRequestSource source, Map<String, String> oapiHeaders, boolean letSleep, boolean bypassCounter, CommandAction action, o iVar) {
        super(ADAPTER, iVar);
        s.g(id, "id");
        s.g(vehicleId, "vehicleId");
        s.g(transports, "transports");
        s.g(source, "source");
        s.g(oapiHeaders, "oapiHeaders");
        this.id = id;
        this.vehicleId = vehicleId;
        this.transports = new ArrayList<>(transports);
        this.source = source;
        this.oapiHeaders = new LinkedHashMap<>(oapiHeaders);
        this.letSleep = letSleep;
        this.bypassCounter = bypassCounter;
        this.action = action;
    }

    public String getId() {
        return this.id;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public List<Transport> getTransports() {
        return this.transports;
    }

    public CommandRequestSource getSource() {
        return this.source;
    }

    public Map<String, String> getOapiHeaders() {
        return this.oapiHeaders;
    }

    public boolean getLetSleep() {
        return this.letSleep;
    }

    public boolean getBypassCounter() {
        return this.bypassCounter;
    }

    public CommandAction getAction() {
        return this.action;
    }

    public static final class Transport {
        // Transport class implementation
    }

    public static final class CommandAction {
        // CommandAction class implementation
    }

    public static final class CommandRequestSource {
        // CommandRequestSource class implementation
    }
```
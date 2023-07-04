package ys;

import com.tesla.command.usecase.CommandSigningRequirement;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final yu.e f59704a;

    /* renamed from: ys.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1359a {
        private C1359a() {
        }

        public /* synthetic */ C1359a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1359a(null);
    }

    public a(yu.e getVehicleData) {
        s.g(getVehicleData, "getVehicleData");
        this.f59704a = getVehicleData;
    }

    public final CommandSigningRequirement a(String vehicleId) {
        CommandSigningRequirement commandSigningRequirement;
        s.g(vehicleId, "vehicleId");
        JSONObject b11 = this.f59704a.b(vehicleId);
        if (b11 == null) {
            commandSigningRequirement = null;
        } else {
            String optString = b11.optString("command_signing");
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -911343192) {
                    if (hashCode != -393139297) {
                        if (hashCode == 109935 && optString.equals("off")) {
                            commandSigningRequirement = CommandSigningRequirement.OFF;
                        }
                    } else if (optString.equals("required")) {
                        commandSigningRequirement = CommandSigningRequirement.REQUIRED;
                    }
                } else if (optString.equals("allowed")) {
                    commandSigningRequirement = CommandSigningRequirement.ALLOWED;
                }
            }
            commandSigningRequirement = CommandSigningRequirement.OFF;
        }
        return commandSigningRequirement == null ? CommandSigningRequirement.OFF : commandSigningRequirement;
    }
}
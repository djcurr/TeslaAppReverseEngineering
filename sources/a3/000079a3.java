package io.sentry.protocol;

import expo.modules.constants.ExponentInstallationId;
import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DebugImage implements x0 {
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* loaded from: classes5.dex */
    public static final class a implements n0<DebugImage> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public DebugImage a(t0 t0Var, d0 d0Var) {
            DebugImage debugImage = new DebugImage();
            t0Var.g();
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1840639000:
                        if (p02.equals("debug_file")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1443345323:
                        if (p02.equals("image_addr")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1442803611:
                        if (p02.equals("image_size")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1127437170:
                        if (p02.equals("code_file")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 3002454:
                        if (p02.equals("arch")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 3575610:
                        if (p02.equals("type")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 3601339:
                        if (p02.equals(ExponentInstallationId.LEGACY_UUID_KEY)) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 547804807:
                        if (p02.equals("debug_id")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case 941842605:
                        if (p02.equals("code_id")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        debugImage.debugFile = t0Var.N1();
                        break;
                    case 1:
                        debugImage.imageAddr = t0Var.N1();
                        break;
                    case 2:
                        debugImage.imageSize = t0Var.K1();
                        break;
                    case 3:
                        debugImage.codeFile = t0Var.N1();
                        break;
                    case 4:
                        debugImage.arch = t0Var.N1();
                        break;
                    case 5:
                        debugImage.type = t0Var.N1();
                        break;
                    case 6:
                        debugImage.uuid = t0Var.N1();
                        break;
                    case 7:
                        debugImage.debugId = t0Var.N1();
                        break;
                    case '\b':
                        debugImage.codeId = t0Var.N1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        t0Var.P1(d0Var, hashMap, p02);
                        break;
                }
            }
            t0Var.C();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.uuid != null) {
            v0Var.P0(ExponentInstallationId.LEGACY_UUID_KEY).G0(this.uuid);
        }
        if (this.type != null) {
            v0Var.P0("type").G0(this.type);
        }
        if (this.debugId != null) {
            v0Var.P0("debug_id").G0(this.debugId);
        }
        if (this.debugFile != null) {
            v0Var.P0("debug_file").G0(this.debugFile);
        }
        if (this.codeId != null) {
            v0Var.P0("code_id").G0(this.codeId);
        }
        if (this.codeFile != null) {
            v0Var.P0("code_file").G0(this.codeFile);
        }
        if (this.imageAddr != null) {
            v0Var.P0("image_addr").G0(this.imageAddr);
        }
        if (this.imageSize != null) {
            v0Var.P0("image_size").F0(this.imageSize);
        }
        if (this.arch != null) {
            v0Var.P0("arch").G0(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.unknown.get(str));
            }
        }
        v0Var.C();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l11) {
        this.imageSize = l11;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j11) {
        this.imageSize = Long.valueOf(j11);
    }
}
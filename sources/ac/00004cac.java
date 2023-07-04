package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class StripeFileParams {
    private final File file;
    private final FileLink fileLink;
    private final StripeFilePurpose purpose;

    public StripeFileParams(File file, StripeFilePurpose purpose) {
        s.g(file, "file");
        s.g(purpose, "purpose");
        this.file = file;
        this.purpose = purpose;
    }

    public static /* synthetic */ StripeFileParams copy$default(StripeFileParams stripeFileParams, File file, StripeFilePurpose stripeFilePurpose, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = stripeFileParams.file;
        }
        if ((i11 & 2) != 0) {
            stripeFilePurpose = stripeFileParams.purpose;
        }
        return stripeFileParams.copy(file, stripeFilePurpose);
    }

    public final File component1$stripe_core_release() {
        return this.file;
    }

    public final StripeFilePurpose component2$stripe_core_release() {
        return this.purpose;
    }

    public final StripeFileParams copy(File file, StripeFilePurpose purpose) {
        s.g(file, "file");
        s.g(purpose, "purpose");
        return new StripeFileParams(file, purpose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeFileParams) {
            StripeFileParams stripeFileParams = (StripeFileParams) obj;
            return s.c(this.file, stripeFileParams.file) && this.purpose == stripeFileParams.purpose;
        }
        return false;
    }

    public final File getFile$stripe_core_release() {
        return this.file;
    }

    public final FileLink getFileLink$stripe_core_release() {
        return this.fileLink;
    }

    public final StripeFilePurpose getPurpose$stripe_core_release() {
        return this.purpose;
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + this.purpose.hashCode();
    }

    public String toString() {
        return "StripeFileParams(file=" + this.file + ", purpose=" + this.purpose + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* loaded from: classes2.dex */
    public static final class FileLink implements Parcelable {
        public static final Parcelable.Creator<FileLink> CREATOR = new Creator();
        private final boolean create;
        private final Long expiresAt;
        private final Map<String, String> metadata;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<FileLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FileLink createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                LinkedHashMap linkedHashMap = null;
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new FileLink(z11, valueOf, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FileLink[] newArray(int i11) {
                return new FileLink[i11];
            }
        }

        public FileLink() {
            this(false, null, null, 7, null);
        }

        public FileLink(boolean z11) {
            this(z11, null, null, 6, null);
        }

        public FileLink(boolean z11, Long l11) {
            this(z11, l11, null, 4, null);
        }

        public FileLink(boolean z11, Long l11, Map<String, String> map) {
            this.create = z11;
            this.expiresAt = l11;
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FileLink copy$default(FileLink fileLink, boolean z11, Long l11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = fileLink.create;
            }
            if ((i11 & 2) != 0) {
                l11 = fileLink.expiresAt;
            }
            if ((i11 & 4) != 0) {
                map = fileLink.metadata;
            }
            return fileLink.copy(z11, l11, map);
        }

        public final boolean component1$stripe_core_release() {
            return this.create;
        }

        public final Long component2$stripe_core_release() {
            return this.expiresAt;
        }

        public final Map<String, String> component3$stripe_core_release() {
            return this.metadata;
        }

        public final FileLink copy(boolean z11, Long l11, Map<String, String> map) {
            return new FileLink(z11, l11, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FileLink) {
                FileLink fileLink = (FileLink) obj;
                return this.create == fileLink.create && s.c(this.expiresAt, fileLink.expiresAt) && s.c(this.metadata, fileLink.metadata);
            }
            return false;
        }

        public final boolean getCreate$stripe_core_release() {
            return this.create;
        }

        public final Long getExpiresAt$stripe_core_release() {
            return this.expiresAt;
        }

        public final Map<String, String> getMetadata$stripe_core_release() {
            return this.metadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z11 = this.create;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i11 = r02 * 31;
            Long l11 = this.expiresAt;
            int hashCode = (i11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Map<String, String> map = this.metadata;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "FileLink(create=" + this.create + ", expiresAt=" + this.expiresAt + ", metadata=" + this.metadata + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.create ? 1 : 0);
            Long l11 = this.expiresAt;
            if (l11 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l11.longValue());
            }
            Map<String, String> map = this.metadata;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }

        public /* synthetic */ FileLink(boolean z11, Long l11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : map);
        }
    }
}
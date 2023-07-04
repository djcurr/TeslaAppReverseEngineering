package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final InternalRewinder f10503a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class InternalRewinder {

        /* renamed from: a  reason: collision with root package name */
        private final ParcelFileDescriptor f10504a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f10504a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f10504a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f10504a;
            } catch (ErrnoException e11) {
                throw new IOException(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10503a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c */
    public ParcelFileDescriptor a() {
        return this.f10503a.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
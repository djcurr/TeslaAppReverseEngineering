package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public RemoteCreator(String str) {
        this.zza = str;
    }

    @KeepForSdk
    protected abstract T getRemoteCreator(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public final T getRemoteCreatorInstance(Context context) {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e11) {
                    throw new RemoteCreatorException("Could not load creator class.", e11);
                } catch (IllegalAccessException e12) {
                    throw new RemoteCreatorException("Could not access creator.", e12);
                } catch (InstantiationException e13) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e13);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return (T) this.zzb;
    }
}
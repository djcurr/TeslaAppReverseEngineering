package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import lm.b;
import lm.c;
import lm.d;
import lm.e;

/* loaded from: classes3.dex */
public final class zzak implements d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final b zzb;
    private static final b zzc;
    private static final c zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final c zzh;
    private final zzao zzi = new zzao(this);

    static {
        b.C0705b a11 = b.a(Action.KEY_ATTRIBUTE);
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("value");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        zzd = new c() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // lm.c
            public final void encode(Object obj, Object obj2) {
                zzak.zzg((Map.Entry) obj, (d) obj2);
            }
        };
    }

    public zzak(OutputStream outputStream, Map map, Map map2, c cVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = cVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, d dVar) {
        dVar.add(zzb, entry.getKey());
        dVar.add(zzc, entry.getValue());
    }

    private static int zzh(b bVar) {
        zzai zzaiVar = (zzai) bVar.c(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(c cVar, Object obj) {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            cVar.encode(obj, this);
            this.zze = outputStream;
            long zza2 = zzafVar.zza();
            zzafVar.close();
            return zza2;
        } catch (Throwable th2) {
            try {
                zzafVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static zzai zzj(b bVar) {
        zzai zzaiVar = (zzai) bVar.c(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzak zzk(c cVar, b bVar, Object obj, boolean z11) {
        long zzi = zzi(cVar, obj);
        if (z11 && zzi == 0) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 2);
        zzo(zzi);
        cVar.encode(obj, this);
        return this;
    }

    private final zzak zzl(e eVar, b bVar, Object obj, boolean z11) {
        this.zzi.zza(bVar, z11);
        eVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i11) {
        while ((i11 & (-128)) != 0) {
            this.zze.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.zze.write(i11 & 127);
    }

    private final void zzo(long j11) {
        while (((-128) & j11) != 0) {
            this.zze.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.zze.write(((int) j11) & 127);
    }

    public final d add(b bVar, double d11) {
        zza(bVar, d11, true);
        return this;
    }

    public final d inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final d nested(b bVar) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final d zza(b bVar, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d11).array());
        return this;
    }

    public final d zzb(b bVar, float f11, boolean z11) {
        if (z11 && f11 == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f11).array());
        return this;
    }

    public final d zzc(b bVar, Object obj, boolean z11) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                zzc(bVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzk(zzd, bVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zza(bVar, ((Double) obj).doubleValue(), z11);
            return this;
        } else if (obj instanceof Float) {
            zzb(bVar, ((Float) obj).floatValue(), z11);
            return this;
        } else if (obj instanceof Number) {
            zze(bVar, ((Number) obj).longValue(), z11);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(bVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        } else {
            c cVar = (c) this.zzf.get(obj.getClass());
            if (cVar != null) {
                zzk(cVar, bVar, obj, z11);
                return this;
            }
            e eVar = (e) this.zzg.get(obj.getClass());
            if (eVar != null) {
                zzl(eVar, bVar, obj, z11);
                return this;
            } else if (obj instanceof zzag) {
                zzd(bVar, ((zzag) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzk(this.zzh, bVar, obj, z11);
                return this;
            }
        }
    }

    public final zzak zzd(b bVar, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return this;
        }
        zzai zzj = zzj(bVar);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzn(i11);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzn((i11 + i11) ^ (i11 >> 31));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i11).array());
        }
        return this;
    }

    public final zzak zze(b bVar, long j11, boolean z11) {
        if (z11 && j11 == 0) {
            return this;
        }
        zzai zzj = zzj(bVar);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzo(j11);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzo((j11 >> 63) ^ (j11 + j11));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j11).array());
        }
        return this;
    }

    public final zzak zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        c cVar = (c) this.zzf.get(obj.getClass());
        if (cVar != null) {
            cVar.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    public final d add(b bVar, float f11) {
        zzb(bVar, f11, true);
        return this;
    }

    public final d nested(String str) {
        return nested(b.d(str));
    }

    @Override // lm.d
    public final /* synthetic */ d add(b bVar, int i11) {
        zzd(bVar, i11, true);
        return this;
    }

    @Override // lm.d
    public final /* synthetic */ d add(b bVar, long j11) {
        zze(bVar, j11, true);
        return this;
    }

    @Override // lm.d
    public final d add(b bVar, Object obj) {
        zzc(bVar, obj, true);
        return this;
    }

    @Override // lm.d
    public final /* synthetic */ d add(b bVar, boolean z11) {
        zzd(bVar, z11 ? 1 : 0, true);
        return this;
    }

    public final d add(String str, double d11) {
        zza(b.d(str), d11, true);
        return this;
    }

    public final d add(String str, int i11) {
        zzd(b.d(str), i11, true);
        return this;
    }

    public final d add(String str, long j11) {
        zze(b.d(str), j11, true);
        return this;
    }

    public final d add(String str, Object obj) {
        zzc(b.d(str), obj, true);
        return this;
    }

    public final d add(String str, boolean z11) {
        zzd(b.d(str), z11 ? 1 : 0, true);
        return this;
    }
}
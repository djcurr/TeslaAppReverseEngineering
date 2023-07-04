package com.google.android.gms.internal.measurement;

import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class zzfy extends zzjz implements zzlh {
    public static final /* synthetic */ int zza = 0;
    private static final zzfy zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private zzgb zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private zzfu zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private zzkg zzi = zzjz.zzby();
    private zzkg zzj = zzjz.zzby();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private zzkg zzH = zzjz.zzby();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private zzke zzU = zzjz.zzbv();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";
    private String zzae = "";

    static {
        zzfy zzfyVar = new zzfy();
        zze = zzfyVar;
        zzjz.zzbE(zzfy.class, zzfyVar);
    }

    private zzfy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzP(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 1073741824;
        zzfyVar.zzO = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzQ(zzfy zzfyVar) {
        zzfyVar.zzf &= Integer.MAX_VALUE;
        zzfyVar.zzP = zze.zzP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzR(zzfy zzfyVar, int i11) {
        zzfyVar.zzg |= 2;
        zzfyVar.zzR = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzS(zzfy zzfyVar, int i11, zzfo zzfoVar) {
        zzfoVar.getClass();
        zzfyVar.zzbG();
        zzfyVar.zzi.set(i11, zzfoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzT(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzg |= 4;
        zzfyVar.zzS = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzU(zzfy zzfyVar, zzgb zzgbVar) {
        zzgbVar.getClass();
        zzfyVar.zzT = zzgbVar;
        zzfyVar.zzg |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzV(zzfy zzfyVar, Iterable iterable) {
        zzke zzkeVar = zzfyVar.zzU;
        if (!zzkeVar.zzc()) {
            int size = zzkeVar.size();
            zzfyVar.zzU = zzkeVar.zzg(size == 0 ? 10 : size + size);
        }
        zzih.zzbo(iterable, zzfyVar.zzU);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzW(zzfy zzfyVar, zzfo zzfoVar) {
        zzfoVar.getClass();
        zzfyVar.zzbG();
        zzfyVar.zzi.add(zzfoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzX(zzfy zzfyVar, long j11) {
        zzfyVar.zzg |= 16;
        zzfyVar.zzV = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzY(zzfy zzfyVar, long j11) {
        zzfyVar.zzg |= 32;
        zzfyVar.zzW = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzZ(zzfy zzfyVar, String str) {
        zzfyVar.zzg |= 128;
        zzfyVar.zzY = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaA(zzfy zzfyVar, boolean z11) {
        zzfyVar.zzf |= 131072;
        zzfyVar.zzA = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaB(zzfy zzfyVar) {
        zzfyVar.zzf &= -131073;
        zzfyVar.zzA = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaC(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 262144;
        zzfyVar.zzB = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaD(zzfy zzfyVar) {
        zzfyVar.zzf &= -262145;
        zzfyVar.zzB = zze.zzB;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaE(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= PKIFailureInfo.signerNotTrusted;
        zzfyVar.zzC = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaF(zzfy zzfyVar, int i11) {
        zzfyVar.zzf |= PKIFailureInfo.badCertTemplate;
        zzfyVar.zzD = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaG(zzfy zzfyVar, String str) {
        zzfyVar.zzf |= PKIFailureInfo.badSenderNonce;
        zzfyVar.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaH(zzfy zzfyVar) {
        zzfyVar.zzf &= -2097153;
        zzfyVar.zzE = zze.zzE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaI(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 4194304;
        zzfyVar.zzF = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaJ(zzfy zzfyVar, boolean z11) {
        zzfyVar.zzf |= 8388608;
        zzfyVar.zzG = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaK(zzfy zzfyVar, Iterable iterable) {
        zzkg zzkgVar = zzfyVar.zzH;
        if (!zzkgVar.zzc()) {
            zzfyVar.zzH = zzjz.zzbz(zzkgVar);
        }
        zzih.zzbo(iterable, zzfyVar.zzH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaM(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzfyVar.zzI = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaN(zzfy zzfyVar, int i11) {
        zzfyVar.zzf |= 33554432;
        zzfyVar.zzJ = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaO(zzfy zzfyVar, int i11) {
        zzfyVar.zzf |= 1;
        zzfyVar.zzh = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaP(zzfy zzfyVar) {
        zzfyVar.zzf &= -268435457;
        zzfyVar.zzM = zze.zzM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaQ(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= PKIFailureInfo.duplicateCertReq;
        zzfyVar.zzN = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaa(zzfy zzfyVar, Iterable iterable) {
        zzfyVar.zzbG();
        zzih.zzbo(iterable, zzfyVar.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzac(zzfy zzfyVar, int i11) {
        zzfyVar.zzbG();
        zzfyVar.zzi.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzad(zzfy zzfyVar, int i11, zzgh zzghVar) {
        zzghVar.getClass();
        zzfyVar.zzbH();
        zzfyVar.zzj.set(i11, zzghVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzae(zzfy zzfyVar, zzgh zzghVar) {
        zzghVar.getClass();
        zzfyVar.zzbH();
        zzfyVar.zzj.add(zzghVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaf(zzfy zzfyVar, Iterable iterable) {
        zzfyVar.zzbH();
        zzih.zzbo(iterable, zzfyVar.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzag(zzfy zzfyVar, int i11) {
        zzfyVar.zzbH();
        zzfyVar.zzj.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzah(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 2;
        zzfyVar.zzk = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzai(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 4;
        zzfyVar.zzl = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaj(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 8;
        zzfyVar.zzm = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzak(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 16;
        zzfyVar.zzn = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzal(zzfy zzfyVar) {
        zzfyVar.zzf &= -17;
        zzfyVar.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzam(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 32;
        zzfyVar.zzo = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzan(zzfy zzfyVar) {
        zzfyVar.zzf &= -33;
        zzfyVar.zzo = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzao(zzfy zzfyVar, String str) {
        zzfyVar.zzf |= 64;
        zzfyVar.zzp = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzap(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 128;
        zzfyVar.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaq(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 256;
        zzfyVar.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzar(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 512;
        zzfyVar.zzs = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzas(zzfy zzfyVar, int i11) {
        zzfyVar.zzf |= 1024;
        zzfyVar.zzt = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzat(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 2048;
        zzfyVar.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzau(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 4096;
        zzfyVar.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzav(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= PKIFailureInfo.certRevoked;
        zzfyVar.zzw = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaw(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 16384;
        zzfyVar.zzx = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzax(zzfy zzfyVar, long j11) {
        zzfyVar.zzf |= 32768;
        zzfyVar.zzy = 60000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzay(zzfy zzfyVar, String str) {
        str.getClass();
        zzfyVar.zzf |= 65536;
        zzfyVar.zzz = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaz(zzfy zzfyVar) {
        zzfyVar.zzf &= -65537;
        zzfyVar.zzz = zze.zzz;
    }

    private final void zzbG() {
        zzkg zzkgVar = this.zzi;
        if (zzkgVar.zzc()) {
            return;
        }
        this.zzi = zzjz.zzbz(zzkgVar);
    }

    private final void zzbH() {
        zzkg zzkgVar = this.zzj;
        if (zzkgVar.zzc()) {
            return;
        }
        this.zzj = zzjz.zzbz(zzkgVar);
    }

    public static zzfx zzu() {
        return (zzfx) zze.zzbs();
    }

    public final String zzA() {
        return this.zzu;
    }

    public final String zzB() {
        return this.zzw;
    }

    public final String zzC() {
        return this.zzY;
    }

    public final String zzD() {
        return this.zzr;
    }

    public final String zzE() {
        return this.zzP;
    }

    public final String zzF() {
        return this.zzI;
    }

    public final String zzG() {
        return this.zzF;
    }

    public final String zzH() {
        return this.zzE;
    }

    public final String zzI() {
        return this.zzq;
    }

    public final String zzJ() {
        return this.zzp;
    }

    public final String zzK() {
        return this.zzz;
    }

    public final String zzL() {
        return this.zzs;
    }

    public final List zzM() {
        return this.zzH;
    }

    public final List zzN() {
        return this.zzi;
    }

    public final List zzO() {
        return this.zzj;
    }

    public final int zza() {
        return this.zzJ;
    }

    public final boolean zzaR() {
        return this.zzA;
    }

    public final boolean zzaS() {
        return this.zzG;
    }

    public final boolean zzaT() {
        return (this.zzf & 1073741824) != 0;
    }

    public final boolean zzaU() {
        return (this.zzf & 33554432) != 0;
    }

    public final boolean zzaV() {
        return (this.zzf & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final boolean zzaW() {
        return (this.zzf & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean zzaX() {
        return (this.zzg & 128) != 0;
    }

    public final boolean zzaY() {
        return (this.zzf & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final boolean zzaZ() {
        return (this.zzg & 16) != 0;
    }

    public final int zzb() {
        return this.zzD;
    }

    public final boolean zzba() {
        return (this.zzf & 8) != 0;
    }

    public final boolean zzbb() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean zzbc() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean zzbd() {
        return (this.zzf & 32) != 0;
    }

    public final boolean zzbe() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & 1) != 0;
    }

    public final boolean zzbg() {
        return (this.zzg & 2) != 0;
    }

    public final boolean zzbh() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean zzbi() {
        return (this.zzf & 4) != 0;
    }

    public final boolean zzbj() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean zzbk() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbl() {
        return (this.zzf & 32768) != 0;
    }

    public final int zzc() {
        return this.zzi.size();
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzR;
    }

    public final int zzf() {
        return this.zzt;
    }

    public final int zzg() {
        return this.zzj.size();
    }

    public final long zzh() {
        return this.zzO;
    }

    public final long zzi() {
        return this.zzN;
    }

    public final long zzj() {
        return this.zzC;
    }

    public final long zzk() {
        return this.zzV;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzjz
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new zzfx(null);
                }
                return new zzfy();
            }
            return zzjz.zzbD(zze, "\u00012\u0000\u0002\u0001?2\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-", new Object[]{"zzf", "zzg", "zzh", "zzi", zzfo.class, "zzj", zzgh.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", zzfk.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", zzfg.zza, "zzaa", "zzab", "zzac", "zzad", "zzae"});
        }
        return (byte) 1;
    }

    public final long zzm() {
        return this.zzm;
    }

    public final long zzn() {
        return this.zzx;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        return this.zzn;
    }

    public final long zzq() {
        return this.zzl;
    }

    public final long zzr() {
        return this.zzk;
    }

    public final long zzs() {
        return this.zzy;
    }

    public final zzfo zzt(int i11) {
        return (zzfo) this.zzi.get(i11);
    }

    public final zzgh zzw(int i11) {
        return (zzgh) this.zzj.get(i11);
    }

    public final String zzx() {
        return this.zzS;
    }

    public final String zzy() {
        return this.zzv;
    }

    public final String zzz() {
        return this.zzB;
    }
}
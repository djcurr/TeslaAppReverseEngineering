package com.google.android.gms.internal.mlkit_vision_face;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgq implements c {
    private static final b zzA;
    private static final b zzB;
    private static final b zzC;
    private static final b zzD;
    private static final b zzE;
    private static final b zzF;
    private static final b zzG;
    private static final b zzH;
    private static final b zzI;
    private static final b zzJ;
    private static final b zzK;
    private static final b zzL;
    private static final b zzM;
    private static final b zzN;
    private static final b zzO;
    private static final b zzP;
    private static final b zzQ;
    private static final b zzR;
    private static final b zzS;
    private static final b zzT;
    private static final b zzU;
    private static final b zzV;
    private static final b zzW;
    private static final b zzX;
    private static final b zzY;
    private static final b zzZ;
    static final zzgq zza = new zzgq();
    private static final b zzaa;
    private static final b zzab;
    private static final b zzac;
    private static final b zzad;
    private static final b zzae;
    private static final b zzaf;
    private static final b zzag;
    private static final b zzah;
    private static final b zzai;
    private static final b zzaj;
    private static final b zzak;
    private static final b zzal;
    private static final b zzam;
    private static final b zzan;
    private static final b zzao;
    private static final b zzap;
    private static final b zzaq;
    private static final b zzar;
    private static final b zzas;
    private static final b zzat;
    private static final b zzau;
    private static final b zzav;
    private static final b zzaw;
    private static final b zzax;
    private static final b zzay;
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;
    private static final b zzk;
    private static final b zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;
    private static final b zzp;
    private static final b zzq;
    private static final b zzr;
    private static final b zzs;
    private static final b zzt;
    private static final b zzu;
    private static final b zzv;
    private static final b zzw;
    private static final b zzx;
    private static final b zzy;
    private static final b zzz;

    static {
        b.C0705b a11 = b.a("systemInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("eventName");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a("isThickClient");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(37);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a("clientType");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(61);
        zze = a14.b(zzcqVar4.zzb()).a();
        b.C0705b a15 = b.a("modelDownloadLogEvent");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(3);
        zzf = a15.b(zzcqVar5.zzb()).a();
        b.C0705b a16 = b.a("customModelLoadLogEvent");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(20);
        zzg = a16.b(zzcqVar6.zzb()).a();
        b.C0705b a17 = b.a("customModelInferenceLogEvent");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(4);
        zzh = a17.b(zzcqVar7.zzb()).a();
        b.C0705b a18 = b.a("customModelCreateLogEvent");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(29);
        zzi = a18.b(zzcqVar8.zzb()).a();
        b.C0705b a19 = b.a("onDeviceFaceDetectionLogEvent");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(5);
        zzj = a19.b(zzcqVar9.zzb()).a();
        b.C0705b a21 = b.a("onDeviceFaceLoadLogEvent");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(59);
        zzk = a21.b(zzcqVar10.zzb()).a();
        b.C0705b a22 = b.a("onDeviceTextDetectionLogEvent");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(6);
        zzl = a22.b(zzcqVar11.zzb()).a();
        b.C0705b a23 = b.a("onDeviceTextDetectionLoadLogEvent");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(79);
        zzm = a23.b(zzcqVar12.zzb()).a();
        b.C0705b a24 = b.a("onDeviceBarcodeDetectionLogEvent");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(7);
        zzn = a24.b(zzcqVar13.zzb()).a();
        b.C0705b a25 = b.a("onDeviceBarcodeLoadLogEvent");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(58);
        zzo = a25.b(zzcqVar14.zzb()).a();
        b.C0705b a26 = b.a("onDeviceImageLabelCreateLogEvent");
        zzcq zzcqVar15 = new zzcq();
        zzcqVar15.zza(48);
        zzp = a26.b(zzcqVar15.zzb()).a();
        b.C0705b a27 = b.a("onDeviceImageLabelLoadLogEvent");
        zzcq zzcqVar16 = new zzcq();
        zzcqVar16.zza(49);
        zzq = a27.b(zzcqVar16.zzb()).a();
        b.C0705b a28 = b.a("onDeviceImageLabelDetectionLogEvent");
        zzcq zzcqVar17 = new zzcq();
        zzcqVar17.zza(18);
        zzr = a28.b(zzcqVar17.zzb()).a();
        b.C0705b a29 = b.a("onDeviceObjectCreateLogEvent");
        zzcq zzcqVar18 = new zzcq();
        zzcqVar18.zza(26);
        zzs = a29.b(zzcqVar18.zzb()).a();
        b.C0705b a31 = b.a("onDeviceObjectLoadLogEvent");
        zzcq zzcqVar19 = new zzcq();
        zzcqVar19.zza(27);
        zzt = a31.b(zzcqVar19.zzb()).a();
        b.C0705b a32 = b.a("onDeviceObjectInferenceLogEvent");
        zzcq zzcqVar20 = new zzcq();
        zzcqVar20.zza(28);
        zzu = a32.b(zzcqVar20.zzb()).a();
        b.C0705b a33 = b.a("onDevicePoseDetectionLogEvent");
        zzcq zzcqVar21 = new zzcq();
        zzcqVar21.zza(44);
        zzv = a33.b(zzcqVar21.zzb()).a();
        b.C0705b a34 = b.a("onDeviceSegmentationLogEvent");
        zzcq zzcqVar22 = new zzcq();
        zzcqVar22.zza(45);
        zzw = a34.b(zzcqVar22.zzb()).a();
        b.C0705b a35 = b.a("onDeviceSmartReplyLogEvent");
        zzcq zzcqVar23 = new zzcq();
        zzcqVar23.zza(19);
        zzx = a35.b(zzcqVar23.zzb()).a();
        b.C0705b a36 = b.a("onDeviceLanguageIdentificationLogEvent");
        zzcq zzcqVar24 = new zzcq();
        zzcqVar24.zza(21);
        zzy = a36.b(zzcqVar24.zzb()).a();
        b.C0705b a37 = b.a("onDeviceTranslationLogEvent");
        zzcq zzcqVar25 = new zzcq();
        zzcqVar25.zza(22);
        zzz = a37.b(zzcqVar25.zzb()).a();
        b.C0705b a38 = b.a("cloudFaceDetectionLogEvent");
        zzcq zzcqVar26 = new zzcq();
        zzcqVar26.zza(8);
        zzA = a38.b(zzcqVar26.zzb()).a();
        b.C0705b a39 = b.a("cloudCropHintDetectionLogEvent");
        zzcq zzcqVar27 = new zzcq();
        zzcqVar27.zza(9);
        zzB = a39.b(zzcqVar27.zzb()).a();
        b.C0705b a41 = b.a("cloudDocumentTextDetectionLogEvent");
        zzcq zzcqVar28 = new zzcq();
        zzcqVar28.zza(10);
        zzC = a41.b(zzcqVar28.zzb()).a();
        b.C0705b a42 = b.a("cloudImagePropertiesDetectionLogEvent");
        zzcq zzcqVar29 = new zzcq();
        zzcqVar29.zza(11);
        zzD = a42.b(zzcqVar29.zzb()).a();
        b.C0705b a43 = b.a("cloudImageLabelDetectionLogEvent");
        zzcq zzcqVar30 = new zzcq();
        zzcqVar30.zza(12);
        zzE = a43.b(zzcqVar30.zzb()).a();
        b.C0705b a44 = b.a("cloudLandmarkDetectionLogEvent");
        zzcq zzcqVar31 = new zzcq();
        zzcqVar31.zza(13);
        zzF = a44.b(zzcqVar31.zzb()).a();
        b.C0705b a45 = b.a("cloudLogoDetectionLogEvent");
        zzcq zzcqVar32 = new zzcq();
        zzcqVar32.zza(14);
        zzG = a45.b(zzcqVar32.zzb()).a();
        b.C0705b a46 = b.a("cloudSafeSearchDetectionLogEvent");
        zzcq zzcqVar33 = new zzcq();
        zzcqVar33.zza(15);
        zzH = a46.b(zzcqVar33.zzb()).a();
        b.C0705b a47 = b.a("cloudTextDetectionLogEvent");
        zzcq zzcqVar34 = new zzcq();
        zzcqVar34.zza(16);
        zzI = a47.b(zzcqVar34.zzb()).a();
        b.C0705b a48 = b.a("cloudWebSearchDetectionLogEvent");
        zzcq zzcqVar35 = new zzcq();
        zzcqVar35.zza(17);
        zzJ = a48.b(zzcqVar35.zzb()).a();
        b.C0705b a49 = b.a("automlImageLabelingCreateLogEvent");
        zzcq zzcqVar36 = new zzcq();
        zzcqVar36.zza(23);
        zzK = a49.b(zzcqVar36.zzb()).a();
        b.C0705b a51 = b.a("automlImageLabelingLoadLogEvent");
        zzcq zzcqVar37 = new zzcq();
        zzcqVar37.zza(24);
        zzL = a51.b(zzcqVar37.zzb()).a();
        b.C0705b a52 = b.a("automlImageLabelingInferenceLogEvent");
        zzcq zzcqVar38 = new zzcq();
        zzcqVar38.zza(25);
        zzM = a52.b(zzcqVar38.zzb()).a();
        b.C0705b a53 = b.a("isModelDownloadedLogEvent");
        zzcq zzcqVar39 = new zzcq();
        zzcqVar39.zza(39);
        zzN = a53.b(zzcqVar39.zzb()).a();
        b.C0705b a54 = b.a("deleteModelLogEvent");
        zzcq zzcqVar40 = new zzcq();
        zzcqVar40.zza(40);
        zzO = a54.b(zzcqVar40.zzb()).a();
        b.C0705b a55 = b.a("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzcq zzcqVar41 = new zzcq();
        zzcqVar41.zza(30);
        zzP = a55.b(zzcqVar41.zzb()).a();
        b.C0705b a56 = b.a("aggregatedCustomModelInferenceLogEvent");
        zzcq zzcqVar42 = new zzcq();
        zzcqVar42.zza(31);
        zzQ = a56.b(zzcqVar42.zzb()).a();
        b.C0705b a57 = b.a("aggregatedOnDeviceFaceDetectionLogEvent");
        zzcq zzcqVar43 = new zzcq();
        zzcqVar43.zza(32);
        zzR = a57.b(zzcqVar43.zzb()).a();
        b.C0705b a58 = b.a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzcq zzcqVar44 = new zzcq();
        zzcqVar44.zza(33);
        zzS = a58.b(zzcqVar44.zzb()).a();
        b.C0705b a59 = b.a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzcq zzcqVar45 = new zzcq();
        zzcqVar45.zza(34);
        zzT = a59.b(zzcqVar45.zzb()).a();
        b.C0705b a61 = b.a("aggregatedOnDeviceObjectInferenceLogEvent");
        zzcq zzcqVar46 = new zzcq();
        zzcqVar46.zza(35);
        zzU = a61.b(zzcqVar46.zzb()).a();
        b.C0705b a62 = b.a("aggregatedOnDeviceTextDetectionLogEvent");
        zzcq zzcqVar47 = new zzcq();
        zzcqVar47.zza(36);
        zzV = a62.b(zzcqVar47.zzb()).a();
        b.C0705b a63 = b.a("aggregatedOnDevicePoseDetectionLogEvent");
        zzcq zzcqVar48 = new zzcq();
        zzcqVar48.zza(46);
        zzW = a63.b(zzcqVar48.zzb()).a();
        b.C0705b a64 = b.a("aggregatedOnDeviceSegmentationLogEvent");
        zzcq zzcqVar49 = new zzcq();
        zzcqVar49.zza(47);
        zzX = a64.b(zzcqVar49.zzb()).a();
        b.C0705b a65 = b.a("pipelineAccelerationInferenceEvents");
        zzcq zzcqVar50 = new zzcq();
        zzcqVar50.zza(69);
        zzY = a65.b(zzcqVar50.zzb()).a();
        b.C0705b a66 = b.a("remoteConfigLogEvent");
        zzcq zzcqVar51 = new zzcq();
        zzcqVar51.zza(42);
        zzZ = a66.b(zzcqVar51.zzb()).a();
        b.C0705b a67 = b.a("inputImageConstructionLogEvent");
        zzcq zzcqVar52 = new zzcq();
        zzcqVar52.zza(50);
        zzaa = a67.b(zzcqVar52.zzb()).a();
        b.C0705b a68 = b.a("leakedHandleEvent");
        zzcq zzcqVar53 = new zzcq();
        zzcqVar53.zza(51);
        zzab = a68.b(zzcqVar53.zzb()).a();
        b.C0705b a69 = b.a("cameraSourceLogEvent");
        zzcq zzcqVar54 = new zzcq();
        zzcqVar54.zza(52);
        zzac = a69.b(zzcqVar54.zzb()).a();
        b.C0705b a71 = b.a("imageLabelOptionalModuleLogEvent");
        zzcq zzcqVar55 = new zzcq();
        zzcqVar55.zza(53);
        zzad = a71.b(zzcqVar55.zzb()).a();
        b.C0705b a72 = b.a("languageIdentificationOptionalModuleLogEvent");
        zzcq zzcqVar56 = new zzcq();
        zzcqVar56.zza(54);
        zzae = a72.b(zzcqVar56.zzb()).a();
        b.C0705b a73 = b.a("faceDetectionOptionalModuleLogEvent");
        zzcq zzcqVar57 = new zzcq();
        zzcqVar57.zza(60);
        zzaf = a73.b(zzcqVar57.zzb()).a();
        b.C0705b a74 = b.a("nlClassifierOptionalModuleLogEvent");
        zzcq zzcqVar58 = new zzcq();
        zzcqVar58.zza(55);
        zzag = a74.b(zzcqVar58.zzb()).a();
        b.C0705b a75 = b.a("nlClassifierClientLibraryLogEvent");
        zzcq zzcqVar59 = new zzcq();
        zzcqVar59.zza(56);
        zzah = a75.b(zzcqVar59.zzb()).a();
        b.C0705b a76 = b.a("accelerationAllowlistLogEvent");
        zzcq zzcqVar60 = new zzcq();
        zzcqVar60.zza(57);
        zzai = a76.b(zzcqVar60.zzb()).a();
        b.C0705b a77 = b.a("toxicityDetectionCreateEvent");
        zzcq zzcqVar61 = new zzcq();
        zzcqVar61.zza(62);
        zzaj = a77.b(zzcqVar61.zzb()).a();
        b.C0705b a78 = b.a("toxicityDetectionLoadEvent");
        zzcq zzcqVar62 = new zzcq();
        zzcqVar62.zza(63);
        zzak = a78.b(zzcqVar62.zzb()).a();
        b.C0705b a79 = b.a("toxicityDetectionInferenceEvent");
        zzcq zzcqVar63 = new zzcq();
        zzcqVar63.zza(64);
        zzal = a79.b(zzcqVar63.zzb()).a();
        b.C0705b a81 = b.a("barcodeDetectionOptionalModuleLogEvent");
        zzcq zzcqVar64 = new zzcq();
        zzcqVar64.zza(65);
        zzam = a81.b(zzcqVar64.zzb()).a();
        b.C0705b a82 = b.a("customImageLabelOptionalModuleLogEvent");
        zzcq zzcqVar65 = new zzcq();
        zzcqVar65.zza(66);
        zzan = a82.b(zzcqVar65.zzb()).a();
        b.C0705b a83 = b.a("codeScannerScanApiEvent");
        zzcq zzcqVar66 = new zzcq();
        zzcqVar66.zza(67);
        zzao = a83.b(zzcqVar66.zzb()).a();
        b.C0705b a84 = b.a("codeScannerOptionalModuleEvent");
        zzcq zzcqVar67 = new zzcq();
        zzcqVar67.zza(68);
        zzap = a84.b(zzcqVar67.zzb()).a();
        b.C0705b a85 = b.a("onDeviceExplicitContentCreateLogEvent");
        zzcq zzcqVar68 = new zzcq();
        zzcqVar68.zza(70);
        zzaq = a85.b(zzcqVar68.zzb()).a();
        b.C0705b a86 = b.a("onDeviceExplicitContentLoadLogEvent");
        zzcq zzcqVar69 = new zzcq();
        zzcqVar69.zza(71);
        zzar = a86.b(zzcqVar69.zzb()).a();
        b.C0705b a87 = b.a("onDeviceExplicitContentInferenceLogEvent");
        zzcq zzcqVar70 = new zzcq();
        zzcqVar70.zza(72);
        zzas = a87.b(zzcqVar70.zzb()).a();
        b.C0705b a88 = b.a("aggregatedOnDeviceExplicitContentLogEvent");
        zzcq zzcqVar71 = new zzcq();
        zzcqVar71.zza(73);
        zzat = a88.b(zzcqVar71.zzb()).a();
        b.C0705b a89 = b.a("onDeviceSelfieFaceCreateLogEvent");
        zzcq zzcqVar72 = new zzcq();
        zzcqVar72.zza(74);
        zzau = a89.b(zzcqVar72.zzb()).a();
        b.C0705b a90 = b.a("onDeviceSelfieFaceLoadLogEvent");
        zzcq zzcqVar73 = new zzcq();
        zzcqVar73.zza(75);
        zzav = a90.b(zzcqVar73.zzb()).a();
        b.C0705b a91 = b.a("onDeviceSelfieFaceLogEvent");
        zzcq zzcqVar74 = new zzcq();
        zzcqVar74.zza(76);
        zzaw = a91.b(zzcqVar74.zzb()).a();
        b.C0705b a92 = b.a("aggregatedOnDeviceSelfieFaceLogEvent");
        zzcq zzcqVar75 = new zzcq();
        zzcqVar75.zza(77);
        zzax = a92.b(zzcqVar75.zzb()).a();
        b.C0705b a93 = b.a("smartReplyOptionalModuleLogEvent");
        zzcq zzcqVar76 = new zzcq();
        zzcqVar76.zza(78);
        zzay = a93.b(zzcqVar76.zzb()).a();
    }

    private zzgq() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzkwVar.zzf());
        dVar.add(zzc, zzkwVar.zzc());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzkwVar.zzb());
        dVar.add(zzf, (Object) null);
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, zzkwVar.zzd());
        dVar.add(zzk, zzkwVar.zze());
        dVar.add(zzl, (Object) null);
        dVar.add(zzm, (Object) null);
        dVar.add(zzn, (Object) null);
        dVar.add(zzo, (Object) null);
        dVar.add(zzp, (Object) null);
        dVar.add(zzq, (Object) null);
        dVar.add(zzr, (Object) null);
        dVar.add(zzs, (Object) null);
        dVar.add(zzt, (Object) null);
        dVar.add(zzu, (Object) null);
        dVar.add(zzv, (Object) null);
        dVar.add(zzw, (Object) null);
        dVar.add(zzx, (Object) null);
        dVar.add(zzy, (Object) null);
        dVar.add(zzz, (Object) null);
        dVar.add(zzA, (Object) null);
        dVar.add(zzB, (Object) null);
        dVar.add(zzC, (Object) null);
        dVar.add(zzD, (Object) null);
        dVar.add(zzE, (Object) null);
        dVar.add(zzF, (Object) null);
        dVar.add(zzG, (Object) null);
        dVar.add(zzH, (Object) null);
        dVar.add(zzI, (Object) null);
        dVar.add(zzJ, (Object) null);
        dVar.add(zzK, (Object) null);
        dVar.add(zzL, (Object) null);
        dVar.add(zzM, (Object) null);
        dVar.add(zzN, (Object) null);
        dVar.add(zzO, (Object) null);
        dVar.add(zzP, (Object) null);
        dVar.add(zzQ, (Object) null);
        dVar.add(zzR, zzkwVar.zza());
        dVar.add(zzS, (Object) null);
        dVar.add(zzT, (Object) null);
        dVar.add(zzU, (Object) null);
        dVar.add(zzV, (Object) null);
        dVar.add(zzW, (Object) null);
        dVar.add(zzX, (Object) null);
        dVar.add(zzY, (Object) null);
        dVar.add(zzZ, (Object) null);
        dVar.add(zzaa, (Object) null);
        dVar.add(zzab, (Object) null);
        dVar.add(zzac, (Object) null);
        dVar.add(zzad, (Object) null);
        dVar.add(zzae, (Object) null);
        dVar.add(zzaf, (Object) null);
        dVar.add(zzag, (Object) null);
        dVar.add(zzah, (Object) null);
        dVar.add(zzai, (Object) null);
        dVar.add(zzaj, (Object) null);
        dVar.add(zzak, (Object) null);
        dVar.add(zzal, (Object) null);
        dVar.add(zzam, (Object) null);
        dVar.add(zzan, (Object) null);
        dVar.add(zzao, (Object) null);
        dVar.add(zzap, (Object) null);
        dVar.add(zzaq, (Object) null);
        dVar.add(zzar, (Object) null);
        dVar.add(zzas, (Object) null);
        dVar.add(zzat, (Object) null);
        dVar.add(zzau, (Object) null);
        dVar.add(zzav, (Object) null);
        dVar.add(zzaw, (Object) null);
        dVar.add(zzax, (Object) null);
        dVar.add(zzay, (Object) null);
    }
}
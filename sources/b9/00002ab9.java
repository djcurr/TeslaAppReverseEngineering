package com.google.android.gms.internal.mlkit_vision_text_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgv implements c {
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
    static final zzgv zza = new zzgv();
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
    private static final b zzaz;
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
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("eventName");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
        b.C0705b a13 = b.a("isThickClient");
        zzcv zzcvVar3 = new zzcv();
        zzcvVar3.zza(37);
        zzd = a13.b(zzcvVar3.zzb()).a();
        b.C0705b a14 = b.a("clientType");
        zzcv zzcvVar4 = new zzcv();
        zzcvVar4.zza(61);
        zze = a14.b(zzcvVar4.zzb()).a();
        b.C0705b a15 = b.a("modelDownloadLogEvent");
        zzcv zzcvVar5 = new zzcv();
        zzcvVar5.zza(3);
        zzf = a15.b(zzcvVar5.zzb()).a();
        b.C0705b a16 = b.a("customModelLoadLogEvent");
        zzcv zzcvVar6 = new zzcv();
        zzcvVar6.zza(20);
        zzg = a16.b(zzcvVar6.zzb()).a();
        b.C0705b a17 = b.a("customModelInferenceLogEvent");
        zzcv zzcvVar7 = new zzcv();
        zzcvVar7.zza(4);
        zzh = a17.b(zzcvVar7.zzb()).a();
        b.C0705b a18 = b.a("customModelCreateLogEvent");
        zzcv zzcvVar8 = new zzcv();
        zzcvVar8.zza(29);
        zzi = a18.b(zzcvVar8.zzb()).a();
        b.C0705b a19 = b.a("onDeviceFaceDetectionLogEvent");
        zzcv zzcvVar9 = new zzcv();
        zzcvVar9.zza(5);
        zzj = a19.b(zzcvVar9.zzb()).a();
        b.C0705b a21 = b.a("onDeviceFaceLoadLogEvent");
        zzcv zzcvVar10 = new zzcv();
        zzcvVar10.zza(59);
        zzk = a21.b(zzcvVar10.zzb()).a();
        b.C0705b a22 = b.a("onDeviceTextDetectionLogEvent");
        zzcv zzcvVar11 = new zzcv();
        zzcvVar11.zza(6);
        zzl = a22.b(zzcvVar11.zzb()).a();
        b.C0705b a23 = b.a("onDeviceTextDetectionLoadLogEvent");
        zzcv zzcvVar12 = new zzcv();
        zzcvVar12.zza(79);
        zzm = a23.b(zzcvVar12.zzb()).a();
        b.C0705b a24 = b.a("onDeviceBarcodeDetectionLogEvent");
        zzcv zzcvVar13 = new zzcv();
        zzcvVar13.zza(7);
        zzn = a24.b(zzcvVar13.zzb()).a();
        b.C0705b a25 = b.a("onDeviceBarcodeLoadLogEvent");
        zzcv zzcvVar14 = new zzcv();
        zzcvVar14.zza(58);
        zzo = a25.b(zzcvVar14.zzb()).a();
        b.C0705b a26 = b.a("onDeviceImageLabelCreateLogEvent");
        zzcv zzcvVar15 = new zzcv();
        zzcvVar15.zza(48);
        zzp = a26.b(zzcvVar15.zzb()).a();
        b.C0705b a27 = b.a("onDeviceImageLabelLoadLogEvent");
        zzcv zzcvVar16 = new zzcv();
        zzcvVar16.zza(49);
        zzq = a27.b(zzcvVar16.zzb()).a();
        b.C0705b a28 = b.a("onDeviceImageLabelDetectionLogEvent");
        zzcv zzcvVar17 = new zzcv();
        zzcvVar17.zza(18);
        zzr = a28.b(zzcvVar17.zzb()).a();
        b.C0705b a29 = b.a("onDeviceObjectCreateLogEvent");
        zzcv zzcvVar18 = new zzcv();
        zzcvVar18.zza(26);
        zzs = a29.b(zzcvVar18.zzb()).a();
        b.C0705b a31 = b.a("onDeviceObjectLoadLogEvent");
        zzcv zzcvVar19 = new zzcv();
        zzcvVar19.zza(27);
        zzt = a31.b(zzcvVar19.zzb()).a();
        b.C0705b a32 = b.a("onDeviceObjectInferenceLogEvent");
        zzcv zzcvVar20 = new zzcv();
        zzcvVar20.zza(28);
        zzu = a32.b(zzcvVar20.zzb()).a();
        b.C0705b a33 = b.a("onDevicePoseDetectionLogEvent");
        zzcv zzcvVar21 = new zzcv();
        zzcvVar21.zza(44);
        zzv = a33.b(zzcvVar21.zzb()).a();
        b.C0705b a34 = b.a("onDeviceSegmentationLogEvent");
        zzcv zzcvVar22 = new zzcv();
        zzcvVar22.zza(45);
        zzw = a34.b(zzcvVar22.zzb()).a();
        b.C0705b a35 = b.a("onDeviceSmartReplyLogEvent");
        zzcv zzcvVar23 = new zzcv();
        zzcvVar23.zza(19);
        zzx = a35.b(zzcvVar23.zzb()).a();
        b.C0705b a36 = b.a("onDeviceLanguageIdentificationLogEvent");
        zzcv zzcvVar24 = new zzcv();
        zzcvVar24.zza(21);
        zzy = a36.b(zzcvVar24.zzb()).a();
        b.C0705b a37 = b.a("onDeviceTranslationLogEvent");
        zzcv zzcvVar25 = new zzcv();
        zzcvVar25.zza(22);
        zzz = a37.b(zzcvVar25.zzb()).a();
        b.C0705b a38 = b.a("cloudFaceDetectionLogEvent");
        zzcv zzcvVar26 = new zzcv();
        zzcvVar26.zza(8);
        zzA = a38.b(zzcvVar26.zzb()).a();
        b.C0705b a39 = b.a("cloudCropHintDetectionLogEvent");
        zzcv zzcvVar27 = new zzcv();
        zzcvVar27.zza(9);
        zzB = a39.b(zzcvVar27.zzb()).a();
        b.C0705b a41 = b.a("cloudDocumentTextDetectionLogEvent");
        zzcv zzcvVar28 = new zzcv();
        zzcvVar28.zza(10);
        zzC = a41.b(zzcvVar28.zzb()).a();
        b.C0705b a42 = b.a("cloudImagePropertiesDetectionLogEvent");
        zzcv zzcvVar29 = new zzcv();
        zzcvVar29.zza(11);
        zzD = a42.b(zzcvVar29.zzb()).a();
        b.C0705b a43 = b.a("cloudImageLabelDetectionLogEvent");
        zzcv zzcvVar30 = new zzcv();
        zzcvVar30.zza(12);
        zzE = a43.b(zzcvVar30.zzb()).a();
        b.C0705b a44 = b.a("cloudLandmarkDetectionLogEvent");
        zzcv zzcvVar31 = new zzcv();
        zzcvVar31.zza(13);
        zzF = a44.b(zzcvVar31.zzb()).a();
        b.C0705b a45 = b.a("cloudLogoDetectionLogEvent");
        zzcv zzcvVar32 = new zzcv();
        zzcvVar32.zza(14);
        zzG = a45.b(zzcvVar32.zzb()).a();
        b.C0705b a46 = b.a("cloudSafeSearchDetectionLogEvent");
        zzcv zzcvVar33 = new zzcv();
        zzcvVar33.zza(15);
        zzH = a46.b(zzcvVar33.zzb()).a();
        b.C0705b a47 = b.a("cloudTextDetectionLogEvent");
        zzcv zzcvVar34 = new zzcv();
        zzcvVar34.zza(16);
        zzI = a47.b(zzcvVar34.zzb()).a();
        b.C0705b a48 = b.a("cloudWebSearchDetectionLogEvent");
        zzcv zzcvVar35 = new zzcv();
        zzcvVar35.zza(17);
        zzJ = a48.b(zzcvVar35.zzb()).a();
        b.C0705b a49 = b.a("automlImageLabelingCreateLogEvent");
        zzcv zzcvVar36 = new zzcv();
        zzcvVar36.zza(23);
        zzK = a49.b(zzcvVar36.zzb()).a();
        b.C0705b a51 = b.a("automlImageLabelingLoadLogEvent");
        zzcv zzcvVar37 = new zzcv();
        zzcvVar37.zza(24);
        zzL = a51.b(zzcvVar37.zzb()).a();
        b.C0705b a52 = b.a("automlImageLabelingInferenceLogEvent");
        zzcv zzcvVar38 = new zzcv();
        zzcvVar38.zza(25);
        zzM = a52.b(zzcvVar38.zzb()).a();
        b.C0705b a53 = b.a("isModelDownloadedLogEvent");
        zzcv zzcvVar39 = new zzcv();
        zzcvVar39.zza(39);
        zzN = a53.b(zzcvVar39.zzb()).a();
        b.C0705b a54 = b.a("deleteModelLogEvent");
        zzcv zzcvVar40 = new zzcv();
        zzcvVar40.zza(40);
        zzO = a54.b(zzcvVar40.zzb()).a();
        b.C0705b a55 = b.a("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzcv zzcvVar41 = new zzcv();
        zzcvVar41.zza(30);
        zzP = a55.b(zzcvVar41.zzb()).a();
        b.C0705b a56 = b.a("aggregatedCustomModelInferenceLogEvent");
        zzcv zzcvVar42 = new zzcv();
        zzcvVar42.zza(31);
        zzQ = a56.b(zzcvVar42.zzb()).a();
        b.C0705b a57 = b.a("aggregatedOnDeviceFaceDetectionLogEvent");
        zzcv zzcvVar43 = new zzcv();
        zzcvVar43.zza(32);
        zzR = a57.b(zzcvVar43.zzb()).a();
        b.C0705b a58 = b.a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzcv zzcvVar44 = new zzcv();
        zzcvVar44.zza(33);
        zzS = a58.b(zzcvVar44.zzb()).a();
        b.C0705b a59 = b.a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzcv zzcvVar45 = new zzcv();
        zzcvVar45.zza(34);
        zzT = a59.b(zzcvVar45.zzb()).a();
        b.C0705b a61 = b.a("aggregatedOnDeviceObjectInferenceLogEvent");
        zzcv zzcvVar46 = new zzcv();
        zzcvVar46.zza(35);
        zzU = a61.b(zzcvVar46.zzb()).a();
        b.C0705b a62 = b.a("aggregatedOnDeviceTextDetectionLogEvent");
        zzcv zzcvVar47 = new zzcv();
        zzcvVar47.zza(36);
        zzV = a62.b(zzcvVar47.zzb()).a();
        b.C0705b a63 = b.a("aggregatedOnDevicePoseDetectionLogEvent");
        zzcv zzcvVar48 = new zzcv();
        zzcvVar48.zza(46);
        zzW = a63.b(zzcvVar48.zzb()).a();
        b.C0705b a64 = b.a("aggregatedOnDeviceSegmentationLogEvent");
        zzcv zzcvVar49 = new zzcv();
        zzcvVar49.zza(47);
        zzX = a64.b(zzcvVar49.zzb()).a();
        b.C0705b a65 = b.a("pipelineAccelerationInferenceEvents");
        zzcv zzcvVar50 = new zzcv();
        zzcvVar50.zza(69);
        zzY = a65.b(zzcvVar50.zzb()).a();
        b.C0705b a66 = b.a("remoteConfigLogEvent");
        zzcv zzcvVar51 = new zzcv();
        zzcvVar51.zza(42);
        zzZ = a66.b(zzcvVar51.zzb()).a();
        b.C0705b a67 = b.a("inputImageConstructionLogEvent");
        zzcv zzcvVar52 = new zzcv();
        zzcvVar52.zza(50);
        zzaa = a67.b(zzcvVar52.zzb()).a();
        b.C0705b a68 = b.a("leakedHandleEvent");
        zzcv zzcvVar53 = new zzcv();
        zzcvVar53.zza(51);
        zzab = a68.b(zzcvVar53.zzb()).a();
        b.C0705b a69 = b.a("cameraSourceLogEvent");
        zzcv zzcvVar54 = new zzcv();
        zzcvVar54.zza(52);
        zzac = a69.b(zzcvVar54.zzb()).a();
        b.C0705b a71 = b.a("imageLabelOptionalModuleLogEvent");
        zzcv zzcvVar55 = new zzcv();
        zzcvVar55.zza(53);
        zzad = a71.b(zzcvVar55.zzb()).a();
        b.C0705b a72 = b.a("languageIdentificationOptionalModuleLogEvent");
        zzcv zzcvVar56 = new zzcv();
        zzcvVar56.zza(54);
        zzae = a72.b(zzcvVar56.zzb()).a();
        b.C0705b a73 = b.a("faceDetectionOptionalModuleLogEvent");
        zzcv zzcvVar57 = new zzcv();
        zzcvVar57.zza(60);
        zzaf = a73.b(zzcvVar57.zzb()).a();
        b.C0705b a74 = b.a("nlClassifierOptionalModuleLogEvent");
        zzcv zzcvVar58 = new zzcv();
        zzcvVar58.zza(55);
        zzag = a74.b(zzcvVar58.zzb()).a();
        b.C0705b a75 = b.a("nlClassifierClientLibraryLogEvent");
        zzcv zzcvVar59 = new zzcv();
        zzcvVar59.zza(56);
        zzah = a75.b(zzcvVar59.zzb()).a();
        b.C0705b a76 = b.a("accelerationAllowlistLogEvent");
        zzcv zzcvVar60 = new zzcv();
        zzcvVar60.zza(57);
        zzai = a76.b(zzcvVar60.zzb()).a();
        b.C0705b a77 = b.a("toxicityDetectionCreateEvent");
        zzcv zzcvVar61 = new zzcv();
        zzcvVar61.zza(62);
        zzaj = a77.b(zzcvVar61.zzb()).a();
        b.C0705b a78 = b.a("toxicityDetectionLoadEvent");
        zzcv zzcvVar62 = new zzcv();
        zzcvVar62.zza(63);
        zzak = a78.b(zzcvVar62.zzb()).a();
        b.C0705b a79 = b.a("toxicityDetectionInferenceEvent");
        zzcv zzcvVar63 = new zzcv();
        zzcvVar63.zza(64);
        zzal = a79.b(zzcvVar63.zzb()).a();
        b.C0705b a81 = b.a("barcodeDetectionOptionalModuleLogEvent");
        zzcv zzcvVar64 = new zzcv();
        zzcvVar64.zza(65);
        zzam = a81.b(zzcvVar64.zzb()).a();
        b.C0705b a82 = b.a("customImageLabelOptionalModuleLogEvent");
        zzcv zzcvVar65 = new zzcv();
        zzcvVar65.zza(66);
        zzan = a82.b(zzcvVar65.zzb()).a();
        b.C0705b a83 = b.a("codeScannerScanApiEvent");
        zzcv zzcvVar66 = new zzcv();
        zzcvVar66.zza(67);
        zzao = a83.b(zzcvVar66.zzb()).a();
        b.C0705b a84 = b.a("codeScannerOptionalModuleEvent");
        zzcv zzcvVar67 = new zzcv();
        zzcvVar67.zza(68);
        zzap = a84.b(zzcvVar67.zzb()).a();
        b.C0705b a85 = b.a("onDeviceExplicitContentCreateLogEvent");
        zzcv zzcvVar68 = new zzcv();
        zzcvVar68.zza(70);
        zzaq = a85.b(zzcvVar68.zzb()).a();
        b.C0705b a86 = b.a("onDeviceExplicitContentLoadLogEvent");
        zzcv zzcvVar69 = new zzcv();
        zzcvVar69.zza(71);
        zzar = a86.b(zzcvVar69.zzb()).a();
        b.C0705b a87 = b.a("onDeviceExplicitContentInferenceLogEvent");
        zzcv zzcvVar70 = new zzcv();
        zzcvVar70.zza(72);
        zzas = a87.b(zzcvVar70.zzb()).a();
        b.C0705b a88 = b.a("aggregatedOnDeviceExplicitContentLogEvent");
        zzcv zzcvVar71 = new zzcv();
        zzcvVar71.zza(73);
        zzat = a88.b(zzcvVar71.zzb()).a();
        b.C0705b a89 = b.a("onDeviceFaceMeshCreateLogEvent");
        zzcv zzcvVar72 = new zzcv();
        zzcvVar72.zza(74);
        zzau = a89.b(zzcvVar72.zzb()).a();
        b.C0705b a90 = b.a("onDeviceFaceMeshLoadLogEvent");
        zzcv zzcvVar73 = new zzcv();
        zzcvVar73.zza(75);
        zzav = a90.b(zzcvVar73.zzb()).a();
        b.C0705b a91 = b.a("onDeviceFaceMeshLogEvent");
        zzcv zzcvVar74 = new zzcv();
        zzcvVar74.zza(76);
        zzaw = a91.b(zzcvVar74.zzb()).a();
        b.C0705b a92 = b.a("aggregatedOnDeviceFaceMeshLogEvent");
        zzcv zzcvVar75 = new zzcv();
        zzcvVar75.zza(77);
        zzax = a92.b(zzcvVar75.zzb()).a();
        b.C0705b a93 = b.a("smartReplyOptionalModuleLogEvent");
        zzcv zzcvVar76 = new zzcv();
        zzcvVar76.zza(78);
        zzay = a93.b(zzcvVar76.zzb()).a();
        b.C0705b a94 = b.a("textDetectionOptionalModuleLogEvent");
        zzcv zzcvVar77 = new zzcv();
        zzcvVar77.zza(80);
        zzaz = a94.b(zzcvVar77.zzb()).a();
    }

    private zzgv() {
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
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
        dVar.add(zzl, zzkwVar.zze());
        dVar.add(zzm, zzkwVar.zzd());
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
        dVar.add(zzR, (Object) null);
        dVar.add(zzS, (Object) null);
        dVar.add(zzT, (Object) null);
        dVar.add(zzU, (Object) null);
        dVar.add(zzV, zzkwVar.zza());
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
        dVar.add(zzaz, (Object) null);
    }
}
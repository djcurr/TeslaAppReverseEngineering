package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhf implements c {
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
    static final zzhf zza = new zzhf();
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
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("eventName");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("isThickClient");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(37);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("clientType");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(61);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("modelDownloadLogEvent");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(3);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("customModelLoadLogEvent");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(20);
        zzg = a16.b(zzdfVar6.zzb()).a();
        b.C0705b a17 = b.a("customModelInferenceLogEvent");
        zzdf zzdfVar7 = new zzdf();
        zzdfVar7.zza(4);
        zzh = a17.b(zzdfVar7.zzb()).a();
        b.C0705b a18 = b.a("customModelCreateLogEvent");
        zzdf zzdfVar8 = new zzdf();
        zzdfVar8.zza(29);
        zzi = a18.b(zzdfVar8.zzb()).a();
        b.C0705b a19 = b.a("onDeviceFaceDetectionLogEvent");
        zzdf zzdfVar9 = new zzdf();
        zzdfVar9.zza(5);
        zzj = a19.b(zzdfVar9.zzb()).a();
        b.C0705b a21 = b.a("onDeviceFaceLoadLogEvent");
        zzdf zzdfVar10 = new zzdf();
        zzdfVar10.zza(59);
        zzk = a21.b(zzdfVar10.zzb()).a();
        b.C0705b a22 = b.a("onDeviceTextDetectionLogEvent");
        zzdf zzdfVar11 = new zzdf();
        zzdfVar11.zza(6);
        zzl = a22.b(zzdfVar11.zzb()).a();
        b.C0705b a23 = b.a("onDeviceTextDetectionLoadLogEvent");
        zzdf zzdfVar12 = new zzdf();
        zzdfVar12.zza(79);
        zzm = a23.b(zzdfVar12.zzb()).a();
        b.C0705b a24 = b.a("onDeviceBarcodeDetectionLogEvent");
        zzdf zzdfVar13 = new zzdf();
        zzdfVar13.zza(7);
        zzn = a24.b(zzdfVar13.zzb()).a();
        b.C0705b a25 = b.a("onDeviceBarcodeLoadLogEvent");
        zzdf zzdfVar14 = new zzdf();
        zzdfVar14.zza(58);
        zzo = a25.b(zzdfVar14.zzb()).a();
        b.C0705b a26 = b.a("onDeviceImageLabelCreateLogEvent");
        zzdf zzdfVar15 = new zzdf();
        zzdfVar15.zza(48);
        zzp = a26.b(zzdfVar15.zzb()).a();
        b.C0705b a27 = b.a("onDeviceImageLabelLoadLogEvent");
        zzdf zzdfVar16 = new zzdf();
        zzdfVar16.zza(49);
        zzq = a27.b(zzdfVar16.zzb()).a();
        b.C0705b a28 = b.a("onDeviceImageLabelDetectionLogEvent");
        zzdf zzdfVar17 = new zzdf();
        zzdfVar17.zza(18);
        zzr = a28.b(zzdfVar17.zzb()).a();
        b.C0705b a29 = b.a("onDeviceObjectCreateLogEvent");
        zzdf zzdfVar18 = new zzdf();
        zzdfVar18.zza(26);
        zzs = a29.b(zzdfVar18.zzb()).a();
        b.C0705b a31 = b.a("onDeviceObjectLoadLogEvent");
        zzdf zzdfVar19 = new zzdf();
        zzdfVar19.zza(27);
        zzt = a31.b(zzdfVar19.zzb()).a();
        b.C0705b a32 = b.a("onDeviceObjectInferenceLogEvent");
        zzdf zzdfVar20 = new zzdf();
        zzdfVar20.zza(28);
        zzu = a32.b(zzdfVar20.zzb()).a();
        b.C0705b a33 = b.a("onDevicePoseDetectionLogEvent");
        zzdf zzdfVar21 = new zzdf();
        zzdfVar21.zza(44);
        zzv = a33.b(zzdfVar21.zzb()).a();
        b.C0705b a34 = b.a("onDeviceSegmentationLogEvent");
        zzdf zzdfVar22 = new zzdf();
        zzdfVar22.zza(45);
        zzw = a34.b(zzdfVar22.zzb()).a();
        b.C0705b a35 = b.a("onDeviceSmartReplyLogEvent");
        zzdf zzdfVar23 = new zzdf();
        zzdfVar23.zza(19);
        zzx = a35.b(zzdfVar23.zzb()).a();
        b.C0705b a36 = b.a("onDeviceLanguageIdentificationLogEvent");
        zzdf zzdfVar24 = new zzdf();
        zzdfVar24.zza(21);
        zzy = a36.b(zzdfVar24.zzb()).a();
        b.C0705b a37 = b.a("onDeviceTranslationLogEvent");
        zzdf zzdfVar25 = new zzdf();
        zzdfVar25.zza(22);
        zzz = a37.b(zzdfVar25.zzb()).a();
        b.C0705b a38 = b.a("cloudFaceDetectionLogEvent");
        zzdf zzdfVar26 = new zzdf();
        zzdfVar26.zza(8);
        zzA = a38.b(zzdfVar26.zzb()).a();
        b.C0705b a39 = b.a("cloudCropHintDetectionLogEvent");
        zzdf zzdfVar27 = new zzdf();
        zzdfVar27.zza(9);
        zzB = a39.b(zzdfVar27.zzb()).a();
        b.C0705b a41 = b.a("cloudDocumentTextDetectionLogEvent");
        zzdf zzdfVar28 = new zzdf();
        zzdfVar28.zza(10);
        zzC = a41.b(zzdfVar28.zzb()).a();
        b.C0705b a42 = b.a("cloudImagePropertiesDetectionLogEvent");
        zzdf zzdfVar29 = new zzdf();
        zzdfVar29.zza(11);
        zzD = a42.b(zzdfVar29.zzb()).a();
        b.C0705b a43 = b.a("cloudImageLabelDetectionLogEvent");
        zzdf zzdfVar30 = new zzdf();
        zzdfVar30.zza(12);
        zzE = a43.b(zzdfVar30.zzb()).a();
        b.C0705b a44 = b.a("cloudLandmarkDetectionLogEvent");
        zzdf zzdfVar31 = new zzdf();
        zzdfVar31.zza(13);
        zzF = a44.b(zzdfVar31.zzb()).a();
        b.C0705b a45 = b.a("cloudLogoDetectionLogEvent");
        zzdf zzdfVar32 = new zzdf();
        zzdfVar32.zza(14);
        zzG = a45.b(zzdfVar32.zzb()).a();
        b.C0705b a46 = b.a("cloudSafeSearchDetectionLogEvent");
        zzdf zzdfVar33 = new zzdf();
        zzdfVar33.zza(15);
        zzH = a46.b(zzdfVar33.zzb()).a();
        b.C0705b a47 = b.a("cloudTextDetectionLogEvent");
        zzdf zzdfVar34 = new zzdf();
        zzdfVar34.zza(16);
        zzI = a47.b(zzdfVar34.zzb()).a();
        b.C0705b a48 = b.a("cloudWebSearchDetectionLogEvent");
        zzdf zzdfVar35 = new zzdf();
        zzdfVar35.zza(17);
        zzJ = a48.b(zzdfVar35.zzb()).a();
        b.C0705b a49 = b.a("automlImageLabelingCreateLogEvent");
        zzdf zzdfVar36 = new zzdf();
        zzdfVar36.zza(23);
        zzK = a49.b(zzdfVar36.zzb()).a();
        b.C0705b a51 = b.a("automlImageLabelingLoadLogEvent");
        zzdf zzdfVar37 = new zzdf();
        zzdfVar37.zza(24);
        zzL = a51.b(zzdfVar37.zzb()).a();
        b.C0705b a52 = b.a("automlImageLabelingInferenceLogEvent");
        zzdf zzdfVar38 = new zzdf();
        zzdfVar38.zza(25);
        zzM = a52.b(zzdfVar38.zzb()).a();
        b.C0705b a53 = b.a("isModelDownloadedLogEvent");
        zzdf zzdfVar39 = new zzdf();
        zzdfVar39.zza(39);
        zzN = a53.b(zzdfVar39.zzb()).a();
        b.C0705b a54 = b.a("deleteModelLogEvent");
        zzdf zzdfVar40 = new zzdf();
        zzdfVar40.zza(40);
        zzO = a54.b(zzdfVar40.zzb()).a();
        b.C0705b a55 = b.a("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzdf zzdfVar41 = new zzdf();
        zzdfVar41.zza(30);
        zzP = a55.b(zzdfVar41.zzb()).a();
        b.C0705b a56 = b.a("aggregatedCustomModelInferenceLogEvent");
        zzdf zzdfVar42 = new zzdf();
        zzdfVar42.zza(31);
        zzQ = a56.b(zzdfVar42.zzb()).a();
        b.C0705b a57 = b.a("aggregatedOnDeviceFaceDetectionLogEvent");
        zzdf zzdfVar43 = new zzdf();
        zzdfVar43.zza(32);
        zzR = a57.b(zzdfVar43.zzb()).a();
        b.C0705b a58 = b.a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzdf zzdfVar44 = new zzdf();
        zzdfVar44.zza(33);
        zzS = a58.b(zzdfVar44.zzb()).a();
        b.C0705b a59 = b.a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzdf zzdfVar45 = new zzdf();
        zzdfVar45.zza(34);
        zzT = a59.b(zzdfVar45.zzb()).a();
        b.C0705b a61 = b.a("aggregatedOnDeviceObjectInferenceLogEvent");
        zzdf zzdfVar46 = new zzdf();
        zzdfVar46.zza(35);
        zzU = a61.b(zzdfVar46.zzb()).a();
        b.C0705b a62 = b.a("aggregatedOnDeviceTextDetectionLogEvent");
        zzdf zzdfVar47 = new zzdf();
        zzdfVar47.zza(36);
        zzV = a62.b(zzdfVar47.zzb()).a();
        b.C0705b a63 = b.a("aggregatedOnDevicePoseDetectionLogEvent");
        zzdf zzdfVar48 = new zzdf();
        zzdfVar48.zza(46);
        zzW = a63.b(zzdfVar48.zzb()).a();
        b.C0705b a64 = b.a("aggregatedOnDeviceSegmentationLogEvent");
        zzdf zzdfVar49 = new zzdf();
        zzdfVar49.zza(47);
        zzX = a64.b(zzdfVar49.zzb()).a();
        b.C0705b a65 = b.a("pipelineAccelerationInferenceEvents");
        zzdf zzdfVar50 = new zzdf();
        zzdfVar50.zza(69);
        zzY = a65.b(zzdfVar50.zzb()).a();
        b.C0705b a66 = b.a("remoteConfigLogEvent");
        zzdf zzdfVar51 = new zzdf();
        zzdfVar51.zza(42);
        zzZ = a66.b(zzdfVar51.zzb()).a();
        b.C0705b a67 = b.a("inputImageConstructionLogEvent");
        zzdf zzdfVar52 = new zzdf();
        zzdfVar52.zza(50);
        zzaa = a67.b(zzdfVar52.zzb()).a();
        b.C0705b a68 = b.a("leakedHandleEvent");
        zzdf zzdfVar53 = new zzdf();
        zzdfVar53.zza(51);
        zzab = a68.b(zzdfVar53.zzb()).a();
        b.C0705b a69 = b.a("cameraSourceLogEvent");
        zzdf zzdfVar54 = new zzdf();
        zzdfVar54.zza(52);
        zzac = a69.b(zzdfVar54.zzb()).a();
        b.C0705b a71 = b.a("imageLabelOptionalModuleLogEvent");
        zzdf zzdfVar55 = new zzdf();
        zzdfVar55.zza(53);
        zzad = a71.b(zzdfVar55.zzb()).a();
        b.C0705b a72 = b.a("languageIdentificationOptionalModuleLogEvent");
        zzdf zzdfVar56 = new zzdf();
        zzdfVar56.zza(54);
        zzae = a72.b(zzdfVar56.zzb()).a();
        b.C0705b a73 = b.a("faceDetectionOptionalModuleLogEvent");
        zzdf zzdfVar57 = new zzdf();
        zzdfVar57.zza(60);
        zzaf = a73.b(zzdfVar57.zzb()).a();
        b.C0705b a74 = b.a("nlClassifierOptionalModuleLogEvent");
        zzdf zzdfVar58 = new zzdf();
        zzdfVar58.zza(55);
        zzag = a74.b(zzdfVar58.zzb()).a();
        b.C0705b a75 = b.a("nlClassifierClientLibraryLogEvent");
        zzdf zzdfVar59 = new zzdf();
        zzdfVar59.zza(56);
        zzah = a75.b(zzdfVar59.zzb()).a();
        b.C0705b a76 = b.a("accelerationAllowlistLogEvent");
        zzdf zzdfVar60 = new zzdf();
        zzdfVar60.zza(57);
        zzai = a76.b(zzdfVar60.zzb()).a();
        b.C0705b a77 = b.a("toxicityDetectionCreateEvent");
        zzdf zzdfVar61 = new zzdf();
        zzdfVar61.zza(62);
        zzaj = a77.b(zzdfVar61.zzb()).a();
        b.C0705b a78 = b.a("toxicityDetectionLoadEvent");
        zzdf zzdfVar62 = new zzdf();
        zzdfVar62.zza(63);
        zzak = a78.b(zzdfVar62.zzb()).a();
        b.C0705b a79 = b.a("toxicityDetectionInferenceEvent");
        zzdf zzdfVar63 = new zzdf();
        zzdfVar63.zza(64);
        zzal = a79.b(zzdfVar63.zzb()).a();
        b.C0705b a81 = b.a("barcodeDetectionOptionalModuleLogEvent");
        zzdf zzdfVar64 = new zzdf();
        zzdfVar64.zza(65);
        zzam = a81.b(zzdfVar64.zzb()).a();
        b.C0705b a82 = b.a("customImageLabelOptionalModuleLogEvent");
        zzdf zzdfVar65 = new zzdf();
        zzdfVar65.zza(66);
        zzan = a82.b(zzdfVar65.zzb()).a();
        b.C0705b a83 = b.a("codeScannerScanApiEvent");
        zzdf zzdfVar66 = new zzdf();
        zzdfVar66.zza(67);
        zzao = a83.b(zzdfVar66.zzb()).a();
        b.C0705b a84 = b.a("codeScannerOptionalModuleEvent");
        zzdf zzdfVar67 = new zzdf();
        zzdfVar67.zza(68);
        zzap = a84.b(zzdfVar67.zzb()).a();
        b.C0705b a85 = b.a("onDeviceExplicitContentCreateLogEvent");
        zzdf zzdfVar68 = new zzdf();
        zzdfVar68.zza(70);
        zzaq = a85.b(zzdfVar68.zzb()).a();
        b.C0705b a86 = b.a("onDeviceExplicitContentLoadLogEvent");
        zzdf zzdfVar69 = new zzdf();
        zzdfVar69.zza(71);
        zzar = a86.b(zzdfVar69.zzb()).a();
        b.C0705b a87 = b.a("onDeviceExplicitContentInferenceLogEvent");
        zzdf zzdfVar70 = new zzdf();
        zzdfVar70.zza(72);
        zzas = a87.b(zzdfVar70.zzb()).a();
        b.C0705b a88 = b.a("aggregatedOnDeviceExplicitContentLogEvent");
        zzdf zzdfVar71 = new zzdf();
        zzdfVar71.zza(73);
        zzat = a88.b(zzdfVar71.zzb()).a();
        b.C0705b a89 = b.a("onDeviceSelfieFaceCreateLogEvent");
        zzdf zzdfVar72 = new zzdf();
        zzdfVar72.zza(74);
        zzau = a89.b(zzdfVar72.zzb()).a();
        b.C0705b a90 = b.a("onDeviceSelfieFaceLoadLogEvent");
        zzdf zzdfVar73 = new zzdf();
        zzdfVar73.zza(75);
        zzav = a90.b(zzdfVar73.zzb()).a();
        b.C0705b a91 = b.a("onDeviceSelfieFaceLogEvent");
        zzdf zzdfVar74 = new zzdf();
        zzdfVar74.zza(76);
        zzaw = a91.b(zzdfVar74.zzb()).a();
        b.C0705b a92 = b.a("aggregatedOnDeviceSelfieFaceLogEvent");
        zzdf zzdfVar75 = new zzdf();
        zzdfVar75.zza(77);
        zzax = a92.b(zzdfVar75.zzb()).a();
        b.C0705b a93 = b.a("smartReplyOptionalModuleLogEvent");
        zzdf zzdfVar76 = new zzdf();
        zzdfVar76.zza(78);
        zzay = a93.b(zzdfVar76.zzb()).a();
    }

    private zzhf() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlf zzlfVar = (zzlf) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzlfVar.zzf());
        dVar.add(zzc, zzlfVar.zzc());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzlfVar.zzb());
        dVar.add(zzf, (Object) null);
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
        dVar.add(zzl, (Object) null);
        dVar.add(zzm, (Object) null);
        dVar.add(zzn, zzlfVar.zzd());
        dVar.add(zzo, zzlfVar.zze());
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
        dVar.add(zzS, zzlfVar.zza());
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
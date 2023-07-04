package com.google.android.gms.measurement.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzna;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznj;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzon;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzpu;
import com.stripe.android.StripePaymentController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzdw {
    public static final zzdv zzA;
    public static final zzdv zzB;
    public static final zzdv zzC;
    public static final zzdv zzD;
    public static final zzdv zzE;
    public static final zzdv zzF;
    public static final zzdv zzG;
    public static final zzdv zzH;
    public static final zzdv zzI;
    public static final zzdv zzJ;
    public static final zzdv zzK;
    public static final zzdv zzL;
    public static final zzdv zzM;
    public static final zzdv zzN;
    public static final zzdv zzO;
    public static final zzdv zzP;
    public static final zzdv zzQ;
    public static final zzdv zzR;
    public static final zzdv zzS;
    public static final zzdv zzT;
    public static final zzdv zzU;
    public static final zzdv zzV;
    public static final zzdv zzW;
    public static final zzdv zzX;
    public static final zzdv zzY;
    public static final zzdv zzZ;
    public static final zzdv zza;
    private static final List zzaA = Collections.synchronizedList(new ArrayList());
    private static final Set zzaB = Collections.synchronizedSet(new HashSet());
    public static final zzdv zzaa;
    public static final zzdv zzab;
    public static final zzdv zzac;
    public static final zzdv zzad;
    public static final zzdv zzae;
    public static final zzdv zzaf;
    public static final zzdv zzag;
    public static final zzdv zzah;
    public static final zzdv zzai;
    public static final zzdv zzaj;
    public static final zzdv zzak;
    public static final zzdv zzal;
    public static final zzdv zzam;
    public static final zzdv zzan;
    public static final zzdv zzao;
    public static final zzdv zzap;
    public static final zzdv zzaq;
    public static final zzdv zzar;
    public static final zzdv zzas;
    public static final zzdv zzat;
    public static final zzdv zzau;
    public static final zzdv zzav;
    public static final zzdv zzaw;
    public static final zzdv zzax;
    public static final zzdv zzay;
    public static final zzdv zzaz;
    public static final zzdv zzb;
    public static final zzdv zzc;
    public static final zzdv zzd;
    public static final zzdv zze;
    public static final zzdv zzf;
    public static final zzdv zzg;
    public static final zzdv zzh;
    public static final zzdv zzi;
    public static final zzdv zzj;
    public static final zzdv zzk;
    public static final zzdv zzl;
    public static final zzdv zzm;
    public static final zzdv zzn;
    public static final zzdv zzo;
    public static final zzdv zzp;
    public static final zzdv zzq;
    public static final zzdv zzr;
    public static final zzdv zzs;
    public static final zzdv zzt;
    public static final zzdv zzu;
    public static final zzdv zzv;
    public static final zzdv zzw;
    public static final zzdv zzx;
    public static final zzdv zzy;
    public static final zzdv zzz;

    static {
        Long valueOf = Long.valueOf((long) AbstractComponentTracker.LINGERING_TIMEOUT);
        zza = zza("measurement.ad_id_cache_time", valueOf, valueOf, new zzds() { // from class: com.google.android.gms.measurement.internal.zzaw
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzb());
            }
        });
        Long valueOf2 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_DAY);
        zzb = zza("measurement.monitoring.sample_period_millis", valueOf2, valueOf2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbh
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzl());
            }
        });
        Long valueOf3 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_HOUR);
        zzc = zza("measurement.config.cache_time", valueOf2, valueOf3, new zzds() { // from class: com.google.android.gms.measurement.internal.zzaz
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzd());
            }
        });
        zzd = zza("measurement.config.url_scheme", "https", "https", new zzds() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return zznm.zzJ();
            }
        });
        zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzds() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return zznm.zzI();
            }
        });
        zzf = zza("measurement.upload.max_bundles", 100, 100, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzv());
            }
        });
        zzg = zza("measurement.upload.max_batch_size", 65536, 65536, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzD());
            }
        });
        zzh = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzu());
            }
        });
        zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzy());
            }
        });
        zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzz());
            }
        });
        zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzx());
            }
        });
        Integer valueOf4 = Integer.valueOf((int) StripePaymentController.PAYMENT_REQUEST_CODE);
        zzl = zza("measurement.upload.max_public_events_per_day", valueOf4, valueOf4, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzA());
            }
        });
        zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzds() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzw());
            }
        });
        zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzC());
            }
        });
        zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzg());
            }
        });
        zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzds() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return zznm.zzK();
            }
        });
        zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzr());
            }
        });
        zzr = zza("measurement.upload.window_interval", valueOf3, valueOf3, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzG());
            }
        });
        zzs = zza("measurement.upload.interval", valueOf3, valueOf3, new zzds() { // from class: com.google.android.gms.measurement.internal.zzax
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzt());
            }
        });
        zzt = zza("measurement.upload.realtime_upload_interval", valueOf, valueOf, new zzds() { // from class: com.google.android.gms.measurement.internal.zzay
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzm());
            }
        });
        zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzba
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zze());
            }
        });
        zzv = zza("measurement.upload.minimum_delay", 500L, 500L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbb
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzk());
            }
        });
        zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbc
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzj());
            }
        });
        zzx = zza("measurement.upload.stale_data_deletion_interval", valueOf2, valueOf2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbd
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzp());
            }
        });
        Long valueOf5 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_WEEK);
        zzy = zza("measurement.upload.refresh_blacklisted_config_interval", valueOf5, valueOf5, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbe
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzn());
            }
        });
        zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbf
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzs());
            }
        });
        Long valueOf6 = Long.valueOf((long) ComponentTracker.DEFAULT_TIMEOUT);
        zzA = zza("measurement.upload.retry_time", valueOf6, valueOf6, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbg
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzF());
            }
        });
        zzB = zza("measurement.upload.retry_count", 6, 6, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzE());
            }
        });
        zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzB());
            }
        });
        zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzf());
            }
        });
        zzE = zza("measurement.audience.filter_result_max_count", 200, 200, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzi());
            }
        });
        zzF = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        zzG = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzH = zza("measurement.upload.max_public_event_params", 25, 25, null);
        zzI = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzow.zzg());
            }
        });
        zzK = zza("measurement.test.string_flag", "---", "---", new zzds() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return zzow.zzf();
            }
        });
        zzL = zza("measurement.test.long_flag", -1L, -1L, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zzow.zzd());
            }
        });
        zzM = zza("measurement.test.int_flag", -2, -2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zzow.zzc());
            }
        });
        Double valueOf7 = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf7, valueOf7, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Double.valueOf(zzow.zzb());
            }
        });
        zzO = zza("measurement.experiment.max_ids", 50, 50, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzh());
            }
        });
        zzP = zza("measurement.max_bundles_per_iteration", 100, 100, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznm.zzc());
            }
        });
        zzQ = zza("measurement.sdk.attribution.cache.ttl", valueOf5, valueOf5, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Long.valueOf(zznm.zzq());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzR = zza("measurement.validation.internal_limits_internal_event_params", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzot.zzc());
            }
        });
        zzS = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpc.zzc());
            }
        });
        zzT = zza("measurement.quality.checksum", bool, bool, null);
        zzU = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzoh.zze());
            }
        });
        zzV = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzoh.zzd());
            }
        });
        zzW = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzoh.zzf());
            }
        });
        zzX = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpr.zzc());
            }
        });
        zzY = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzon.zzc());
            }
        });
        zzZ = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzoq.zzc());
            }
        });
        zzaa = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpo.zzd());
            }
        });
        zzab = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpu.zzc());
            }
        });
        zzac = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzob.zzd());
            }
        });
        zzad = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzok.zzd());
            }
        });
        zzae = zza("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpf.zzc());
            }
        });
        zzaf = zza("measurement.upload.file_truncate_fix", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzny.zzc());
            }
        });
        zzag = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpl.zzc());
            }
        });
        zzah = zza("measurement.androidId.delete_feature", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zznd.zzc());
            }
        });
        zzai = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Integer.valueOf((int) zznp.zzb());
            }
        });
        zzaj = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzng.zzc());
            }
        });
        zzak = zza("measurement.service.click_identifier_control", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zznj.zzc());
            }
        });
        zzal = zza("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzoe.zzd());
            }
        });
        zzam = zza("measurement.module.pixie.fix_array", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzoz.zzd());
            }
        });
        zzan = zza("measurement.adid_zero.service", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzna.zze());
            }
        });
        zzao = zza("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzna.zzg());
            }
        });
        zzap = zza("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzna.zzh());
            }
        });
        zzaq = zza("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzna.zzi());
            }
        });
        zzar = zza("measurement.adid_zero.adid_uid", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzna.zzf());
            }
        });
        zzas = zza("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzna.zzd());
            }
        });
        zzat = zza("measurement.service.refactor.package_side_screen", bool2, bool2, new zzds() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzpi.zzd());
            }
        });
        zzau = zza("measurement.enhanced_campaign.service", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzns.zze());
            }
        });
        zzav = zza("measurement.enhanced_campaign.client", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzns.zzd());
            }
        });
        zzaw = zza("measurement.enhanced_campaign.srsltid.client", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzns.zzf());
            }
        });
        zzax = zza("measurement.enhanced_campaign.srsltid.service", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zzns.zzg());
            }
        });
        zzay = zza("measurement.service.store_null_safelist", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zznv.zzd());
            }
        });
        zzaz = zza("measurement.service.store_safelist", bool, bool, new zzds() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzds
            public final Object zza() {
                zzdv zzdvVar = zzdw.zza;
                return Boolean.valueOf(zznv.zze());
            }
        });
    }

    @VisibleForTesting
    static zzdv zza(String str, Object obj, Object obj2, zzds zzdsVar) {
        zzdv zzdvVar = new zzdv(str, obj, obj2, zzdsVar, null);
        zzaA.add(zzdvVar);
        return zzdvVar;
    }

    public static Map zzc(Context context) {
        com.google.android.gms.internal.measurement.zzha zza2 = com.google.android.gms.internal.measurement.zzha.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzhk.zza("com.google.android.gms.measurement"));
        return zza2 == null ? Collections.emptyMap() : zza2.zzc();
    }
}
package com.plaid.internal.core.protos.analyticalcore;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.b;
import com.plaid.internal.core.protos.analyticalcore.Analytical$AlarmSettings;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Analytical$AnalyticalLogAlertSettings extends GeneratedMessageLite<Analytical$AnalyticalLogAlertSettings, a> implements MessageLiteOrBuilder {
    private static final Analytical$AnalyticalLogAlertSettings DEFAULT_INSTANCE;
    public static final int ITERATOR_AGE_MILLIS_ALARM_SETTINGS_FIELD_NUMBER = 3;
    public static final int NON_PRODUCTION_ALERT_LEVEL_FIELD_NUMBER = 2;
    private static volatile Parser<Analytical$AnalyticalLogAlertSettings> PARSER = null;
    public static final int PRODUCTION_ALERT_LEVEL_FIELD_NUMBER = 1;
    public static final int PUT_RECORDS_COUNT_PERCENT_ALARM_SETTINGS_FIELD_NUMBER = 4;
    public static final int PUT_RECORDS_DATA_PERCENT_ALARM_SETTINGS_FIELD_NUMBER = 5;
    public static final int SUCCESSFUL_PUT_RECORDS_PERCENT_ALARM_SETTINGS_FIELD_NUMBER = 6;
    private Analytical$AlarmSettings iteratorAgeMillisAlarmSettings_;
    private int nonProductionAlertLevel_;
    private int productionAlertLevel_;
    private Analytical$AlarmSettings putRecordsCountPercentAlarmSettings_;
    private Analytical$AlarmSettings putRecordsDataPercentAlarmSettings_;
    private Analytical$AlarmSettings successfulPutRecordsPercentAlarmSettings_;

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$AnalyticalLogAlertSettings, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$AnalyticalLogAlertSettings.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$AnalyticalLogAlertSettings analytical$AnalyticalLogAlertSettings = new Analytical$AnalyticalLogAlertSettings();
        DEFAULT_INSTANCE = analytical$AnalyticalLogAlertSettings;
        GeneratedMessageLite.registerDefaultInstance(Analytical$AnalyticalLogAlertSettings.class, analytical$AnalyticalLogAlertSettings);
    }

    private Analytical$AnalyticalLogAlertSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIteratorAgeMillisAlarmSettings() {
        this.iteratorAgeMillisAlarmSettings_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonProductionAlertLevel() {
        this.nonProductionAlertLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductionAlertLevel() {
        this.productionAlertLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPutRecordsCountPercentAlarmSettings() {
        this.putRecordsCountPercentAlarmSettings_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPutRecordsDataPercentAlarmSettings() {
        this.putRecordsDataPercentAlarmSettings_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccessfulPutRecordsPercentAlarmSettings() {
        this.successfulPutRecordsPercentAlarmSettings_ = null;
    }

    public static Analytical$AnalyticalLogAlertSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIteratorAgeMillisAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        Analytical$AlarmSettings analytical$AlarmSettings2 = this.iteratorAgeMillisAlarmSettings_;
        if (analytical$AlarmSettings2 != null && analytical$AlarmSettings2 != Analytical$AlarmSettings.getDefaultInstance()) {
            this.iteratorAgeMillisAlarmSettings_ = Analytical$AlarmSettings.newBuilder(this.iteratorAgeMillisAlarmSettings_).mergeFrom((Analytical$AlarmSettings.a) analytical$AlarmSettings).buildPartial();
        } else {
            this.iteratorAgeMillisAlarmSettings_ = analytical$AlarmSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePutRecordsCountPercentAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        Analytical$AlarmSettings analytical$AlarmSettings2 = this.putRecordsCountPercentAlarmSettings_;
        if (analytical$AlarmSettings2 != null && analytical$AlarmSettings2 != Analytical$AlarmSettings.getDefaultInstance()) {
            this.putRecordsCountPercentAlarmSettings_ = Analytical$AlarmSettings.newBuilder(this.putRecordsCountPercentAlarmSettings_).mergeFrom((Analytical$AlarmSettings.a) analytical$AlarmSettings).buildPartial();
        } else {
            this.putRecordsCountPercentAlarmSettings_ = analytical$AlarmSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePutRecordsDataPercentAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        Analytical$AlarmSettings analytical$AlarmSettings2 = this.putRecordsDataPercentAlarmSettings_;
        if (analytical$AlarmSettings2 != null && analytical$AlarmSettings2 != Analytical$AlarmSettings.getDefaultInstance()) {
            this.putRecordsDataPercentAlarmSettings_ = Analytical$AlarmSettings.newBuilder(this.putRecordsDataPercentAlarmSettings_).mergeFrom((Analytical$AlarmSettings.a) analytical$AlarmSettings).buildPartial();
        } else {
            this.putRecordsDataPercentAlarmSettings_ = analytical$AlarmSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuccessfulPutRecordsPercentAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        Analytical$AlarmSettings analytical$AlarmSettings2 = this.successfulPutRecordsPercentAlarmSettings_;
        if (analytical$AlarmSettings2 != null && analytical$AlarmSettings2 != Analytical$AlarmSettings.getDefaultInstance()) {
            this.successfulPutRecordsPercentAlarmSettings_ = Analytical$AlarmSettings.newBuilder(this.successfulPutRecordsPercentAlarmSettings_).mergeFrom((Analytical$AlarmSettings.a) analytical$AlarmSettings).buildPartial();
        } else {
            this.successfulPutRecordsPercentAlarmSettings_ = analytical$AlarmSettings;
        }
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$AnalyticalLogAlertSettings parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$AnalyticalLogAlertSettings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIteratorAgeMillisAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        this.iteratorAgeMillisAlarmSettings_ = analytical$AlarmSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonProductionAlertLevel(b bVar) {
        this.nonProductionAlertLevel_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonProductionAlertLevelValue(int i11) {
        this.nonProductionAlertLevel_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductionAlertLevel(b bVar) {
        this.productionAlertLevel_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductionAlertLevelValue(int i11) {
        this.productionAlertLevel_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPutRecordsCountPercentAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        this.putRecordsCountPercentAlarmSettings_ = analytical$AlarmSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPutRecordsDataPercentAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        this.putRecordsDataPercentAlarmSettings_ = analytical$AlarmSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessfulPutRecordsPercentAlarmSettings(Analytical$AlarmSettings analytical$AlarmSettings) {
        analytical$AlarmSettings.getClass();
        this.successfulPutRecordsPercentAlarmSettings_ = analytical$AlarmSettings;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$AnalyticalLogAlertSettings();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003\t\u0004\t\u0005\t\u0006\t", new Object[]{"productionAlertLevel_", "nonProductionAlertLevel_", "iteratorAgeMillisAlarmSettings_", "putRecordsCountPercentAlarmSettings_", "putRecordsDataPercentAlarmSettings_", "successfulPutRecordsPercentAlarmSettings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$AnalyticalLogAlertSettings> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$AnalyticalLogAlertSettings.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Analytical$AlarmSettings getIteratorAgeMillisAlarmSettings() {
        Analytical$AlarmSettings analytical$AlarmSettings = this.iteratorAgeMillisAlarmSettings_;
        return analytical$AlarmSettings == null ? Analytical$AlarmSettings.getDefaultInstance() : analytical$AlarmSettings;
    }

    public b getNonProductionAlertLevel() {
        b forNumber = b.forNumber(this.nonProductionAlertLevel_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getNonProductionAlertLevelValue() {
        return this.nonProductionAlertLevel_;
    }

    public b getProductionAlertLevel() {
        b forNumber = b.forNumber(this.productionAlertLevel_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getProductionAlertLevelValue() {
        return this.productionAlertLevel_;
    }

    public Analytical$AlarmSettings getPutRecordsCountPercentAlarmSettings() {
        Analytical$AlarmSettings analytical$AlarmSettings = this.putRecordsCountPercentAlarmSettings_;
        return analytical$AlarmSettings == null ? Analytical$AlarmSettings.getDefaultInstance() : analytical$AlarmSettings;
    }

    public Analytical$AlarmSettings getPutRecordsDataPercentAlarmSettings() {
        Analytical$AlarmSettings analytical$AlarmSettings = this.putRecordsDataPercentAlarmSettings_;
        return analytical$AlarmSettings == null ? Analytical$AlarmSettings.getDefaultInstance() : analytical$AlarmSettings;
    }

    public Analytical$AlarmSettings getSuccessfulPutRecordsPercentAlarmSettings() {
        Analytical$AlarmSettings analytical$AlarmSettings = this.successfulPutRecordsPercentAlarmSettings_;
        return analytical$AlarmSettings == null ? Analytical$AlarmSettings.getDefaultInstance() : analytical$AlarmSettings;
    }

    public boolean hasIteratorAgeMillisAlarmSettings() {
        return this.iteratorAgeMillisAlarmSettings_ != null;
    }

    public boolean hasPutRecordsCountPercentAlarmSettings() {
        return this.putRecordsCountPercentAlarmSettings_ != null;
    }

    public boolean hasPutRecordsDataPercentAlarmSettings() {
        return this.putRecordsDataPercentAlarmSettings_ != null;
    }

    public boolean hasSuccessfulPutRecordsPercentAlarmSettings() {
        return this.successfulPutRecordsPercentAlarmSettings_ != null;
    }

    public static a newBuilder(Analytical$AnalyticalLogAlertSettings analytical$AnalyticalLogAlertSettings) {
        return DEFAULT_INSTANCE.createBuilder(analytical$AnalyticalLogAlertSettings);
    }

    public static Analytical$AnalyticalLogAlertSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(ByteString byteString) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(byte[] bArr) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(InputStream inputStream) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$AnalyticalLogAlertSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$AnalyticalLogAlertSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
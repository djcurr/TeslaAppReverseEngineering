package com.google.protobuf;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Protobuf {
    private static final Protobuf INSTANCE = new Protobuf();
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap();
    private final SchemaFactory schemaFactory = new ManifestSchemaFactory();

    private Protobuf() {
    }

    public static Protobuf getInstance() {
        return INSTANCE;
    }

    int getTotalSchemaSize() {
        int i11 = 0;
        for (Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof MessageSchema) {
                i11 += ((MessageSchema) schema).getSchemaSize();
            }
        }
        return i11;
    }

    <T> boolean isInitialized(T t11) {
        return schemaFor((Protobuf) t11).isInitialized(t11);
    }

    public <T> void makeImmutable(T t11) {
        schemaFor((Protobuf) t11).makeImmutable(t11);
    }

    public <T> void mergeFrom(T t11, Reader reader) {
        mergeFrom(t11, reader, ExtensionRegistryLite.getEmptyRegistry());
    }

    public Schema<?> registerSchema(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    public Schema<?> registerSchemaOverride(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        Schema<T> schema = (Schema<T>) this.schemaCache.get(cls);
        if (schema == null) {
            Schema<T> createSchema = this.schemaFactory.createSchema(cls);
            Schema<T> schema2 = (Schema<T>) registerSchema(cls, createSchema);
            return schema2 != null ? schema2 : createSchema;
        }
        return schema;
    }

    public <T> void writeTo(T t11, Writer writer) {
        schemaFor((Protobuf) t11).writeTo(t11, writer);
    }

    public <T> void mergeFrom(T t11, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        schemaFor((Protobuf) t11).mergeFrom(t11, reader, extensionRegistryLite);
    }

    public <T> Schema<T> schemaFor(T t11) {
        return schemaFor((Class) t11.getClass());
    }
}
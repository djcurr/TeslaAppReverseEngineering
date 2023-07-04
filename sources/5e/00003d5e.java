package com.google.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public interface TypeOrBuilder extends MessageOrBuilder {
    Field getFields(int i11);

    int getFieldsCount();

    List<Field> getFieldsList();

    FieldOrBuilder getFieldsOrBuilder(int i11);

    List<? extends FieldOrBuilder> getFieldsOrBuilderList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i11);

    ByteString getOneofsBytes(int i11);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i11);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();

    SourceContext getSourceContext();

    SourceContextOrBuilder getSourceContextOrBuilder();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
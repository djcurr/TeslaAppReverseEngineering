package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessage.Builder;
import com.google.protobuf.MessageOrBuilder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class RepeatedFieldBuilderV3<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {
    private List<SingleFieldBuilderV3<MType, BType, IType>> builders;
    private BuilderExternalList<MType, BType, IType> externalBuilderList;
    private MessageExternalList<MType, BType, IType> externalMessageList;
    private MessageOrBuilderExternalList<MType, BType, IType> externalMessageOrBuilderList;
    private boolean isClean;
    private boolean isMessagesListMutable;
    private List<MType> messages;
    private AbstractMessage.BuilderParent parent;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class BuilderExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<BType> {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        BuilderExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        void incrementModCount() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public BType get(int i11) {
            return this.builder.getBuilder(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class MessageExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<MType> {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        MessageExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        void incrementModCount() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public MType get(int i11) {
            return this.builder.getMessage(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class MessageOrBuilderExternalList<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> extends AbstractList<IType> {
        RepeatedFieldBuilderV3<MType, BType, IType> builder;

        MessageOrBuilderExternalList(RepeatedFieldBuilderV3<MType, BType, IType> repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        void incrementModCount() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public IType get(int i11) {
            return this.builder.getMessageOrBuilder(i11);
        }
    }

    public RepeatedFieldBuilderV3(List<MType> list, boolean z11, AbstractMessage.BuilderParent builderParent, boolean z12) {
        this.messages = list;
        this.isMessagesListMutable = z11;
        this.parent = builderParent;
        this.isClean = z12;
    }

    private void ensureBuilders() {
        if (this.builders == null) {
            this.builders = new ArrayList(this.messages.size());
            for (int i11 = 0; i11 < this.messages.size(); i11++) {
                this.builders.add(null);
            }
        }
    }

    private void ensureMutableMessageList() {
        if (this.isMessagesListMutable) {
            return;
        }
        this.messages = new ArrayList(this.messages);
        this.isMessagesListMutable = true;
    }

    private void incrementModCounts() {
        MessageExternalList<MType, BType, IType> messageExternalList = this.externalMessageList;
        if (messageExternalList != null) {
            messageExternalList.incrementModCount();
        }
        BuilderExternalList<MType, BType, IType> builderExternalList = this.externalBuilderList;
        if (builderExternalList != null) {
            builderExternalList.incrementModCount();
        }
        MessageOrBuilderExternalList<MType, BType, IType> messageOrBuilderExternalList = this.externalMessageOrBuilderList;
        if (messageOrBuilderExternalList != null) {
            messageOrBuilderExternalList.incrementModCount();
        }
    }

    private void onChanged() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.isClean || (builderParent = this.parent) == null) {
            return;
        }
        builderParent.markDirty();
        this.isClean = false;
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> addAllMessages(Iterable<? extends MType> iterable) {
        for (MType mtype : iterable) {
            Internal.checkNotNull(mtype);
        }
        int i11 = -1;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            i11 = collection.size();
        }
        ensureMutableMessageList();
        if (i11 >= 0) {
            List<MType> list = this.messages;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + i11);
            }
        }
        for (MType mtype2 : iterable) {
            addMessage(mtype2);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType addBuilder(MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = new SingleFieldBuilderV3<>(mtype, this, this.isClean);
        this.messages.add(null);
        this.builders.add(singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return singleFieldBuilderV3.getBuilder();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.add(mtype);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null) {
            list.add(null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public List<MType> build() {
        boolean z11;
        this.isClean = true;
        boolean z12 = this.isMessagesListMutable;
        if (!z12 && this.builders == null) {
            return this.messages;
        }
        if (!z12) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.messages.size()) {
                    z11 = true;
                    break;
                }
                MType mtype = this.messages.get(i11);
                SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = this.builders.get(i11);
                if (singleFieldBuilderV3 != null && singleFieldBuilderV3.build() != mtype) {
                    z11 = false;
                    break;
                }
                i11++;
            }
            if (z11) {
                return this.messages;
            }
        }
        ensureMutableMessageList();
        for (int i12 = 0; i12 < this.messages.size(); i12++) {
            this.messages.set(i12, getMessage(i12, true));
        }
        List<MType> unmodifiableList = Collections.unmodifiableList(this.messages);
        this.messages = unmodifiableList;
        this.isMessagesListMutable = false;
        return unmodifiableList;
    }

    public void clear() {
        this.messages = Collections.emptyList();
        this.isMessagesListMutable = false;
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null) {
            for (SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 : list) {
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                }
            }
            this.builders = null;
        }
        onChanged();
        incrementModCounts();
    }

    public void dispose() {
        this.parent = null;
    }

    public BType getBuilder(int i11) {
        ensureBuilders();
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = this.builders.get(i11);
        if (singleFieldBuilderV3 == null) {
            SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV32 = new SingleFieldBuilderV3<>(this.messages.get(i11), this, this.isClean);
            this.builders.set(i11, singleFieldBuilderV32);
            singleFieldBuilderV3 = singleFieldBuilderV32;
        }
        return singleFieldBuilderV3.getBuilder();
    }

    public List<BType> getBuilderList() {
        if (this.externalBuilderList == null) {
            this.externalBuilderList = new BuilderExternalList<>(this);
        }
        return this.externalBuilderList;
    }

    public int getCount() {
        return this.messages.size();
    }

    public MType getMessage(int i11) {
        return getMessage(i11, false);
    }

    public List<MType> getMessageList() {
        if (this.externalMessageList == null) {
            this.externalMessageList = new MessageExternalList<>(this);
        }
        return this.externalMessageList;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.protobuf.MessageOrBuilder, IType extends com.google.protobuf.MessageOrBuilder] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.protobuf.MessageOrBuilder, IType extends com.google.protobuf.MessageOrBuilder] */
    public IType getMessageOrBuilder(int i11) {
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list == null) {
            return this.messages.get(i11);
        }
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = list.get(i11);
        if (singleFieldBuilderV3 == null) {
            return this.messages.get(i11);
        }
        return singleFieldBuilderV3.getMessageOrBuilder();
    }

    public List<IType> getMessageOrBuilderList() {
        if (this.externalMessageOrBuilderList == null) {
            this.externalMessageOrBuilderList = new MessageOrBuilderExternalList<>(this);
        }
        return this.externalMessageOrBuilderList;
    }

    public boolean isEmpty() {
        return this.messages.isEmpty();
    }

    @Override // com.google.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        onChanged();
    }

    public void remove(int i11) {
        SingleFieldBuilderV3<MType, BType, IType> remove;
        ensureMutableMessageList();
        this.messages.remove(i11);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null && (remove = list.remove(i11)) != null) {
            remove.dispose();
        }
        onChanged();
        incrementModCounts();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> setMessage(int i11, MType mtype) {
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3;
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.set(i11, mtype);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null && (singleFieldBuilderV3 = list.set(i11, null)) != null) {
            singleFieldBuilderV3.dispose();
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    private MType getMessage(int i11, boolean z11) {
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list == null) {
            return this.messages.get(i11);
        }
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = list.get(i11);
        if (singleFieldBuilderV3 == null) {
            return this.messages.get(i11);
        }
        return z11 ? singleFieldBuilderV3.build() : singleFieldBuilderV3.getMessage();
    }

    public RepeatedFieldBuilderV3<MType, BType, IType> addMessage(int i11, MType mtype) {
        Internal.checkNotNull(mtype);
        ensureMutableMessageList();
        this.messages.add(i11, mtype);
        List<SingleFieldBuilderV3<MType, BType, IType>> list = this.builders;
        if (list != null) {
            list.add(i11, null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public BType addBuilder(int i11, MType mtype) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3<MType, BType, IType> singleFieldBuilderV3 = new SingleFieldBuilderV3<>(mtype, this, this.isClean);
        this.messages.add(i11, null);
        this.builders.add(i11, singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return singleFieldBuilderV3.getBuilder();
    }
}
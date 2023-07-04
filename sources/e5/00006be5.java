package expo.modules.webbrowser;

import expo.modules.core.interfaces.Consumer;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes5.dex */
public class DeferredClientActionsQueue<T> {
    private Queue<Consumer<T>> actions = new LinkedList();
    private T client;

    private void addActionToQueue(Consumer<T> consumer) {
        this.actions.add(consumer);
    }

    private void executeQueuedActions() {
        if (this.client != null) {
            Consumer<T> poll = this.actions.poll();
            while (poll != null) {
                poll.apply(this.client);
                poll = this.actions.poll();
            }
        }
    }

    public void clear() {
        this.client = null;
        this.actions.clear();
    }

    public void executeOrQueueAction(Consumer<T> consumer) {
        T t11 = this.client;
        if (t11 != null) {
            consumer.apply(t11);
        } else {
            addActionToQueue(consumer);
        }
    }

    public boolean hasClient() {
        return this.client != null;
    }

    public void setClient(T t11) {
        this.client = t11;
        executeQueuedActions();
    }
}
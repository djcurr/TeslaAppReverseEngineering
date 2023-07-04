package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Stack;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class NestedComplexPropertyIA extends ImplicitAction {
    Stack<IADataForComplexProperty> actionDataStack = new Stack<>();

    /* renamed from: ch.qos.logback.core.joran.action.NestedComplexPropertyIA$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$util$AggregationType;

        static {
            int[] iArr = new int[AggregationType.values().length];
            $SwitchMap$ch$qos$logback$core$util$AggregationType = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        IADataForComplexProperty peek = this.actionDataStack.peek();
        String subst = interpretationContext.subst(attributes.getValue(Action.CLASS_ATTRIBUTE));
        try {
            Class<?> loadClass = !OptionHelper.isEmpty(subst) ? Loader.loadClass(subst, this.context) : peek.parentBean.getClassNameViaImplicitRules(peek.getComplexPropertyName(), peek.getAggregationType(), interpretationContext.getDefaultNestedComponentRegistry());
            if (loadClass == null) {
                peek.inError = true;
                addError("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (OptionHelper.isEmpty(subst)) {
                addInfo("Assuming default type [" + loadClass.getName() + "] for [" + str + "] property");
            }
            peek.setNestedComplexProperty(loadClass.getConstructor(new Class[0]).newInstance(new Object[0]));
            if (peek.getNestedComplexProperty() instanceof ContextAware) {
                ((ContextAware) peek.getNestedComplexProperty()).setContext(this.context);
            }
            interpretationContext.pushObject(peek.getNestedComplexProperty());
        } catch (Exception e11) {
            peek.inError = true;
            addError("Could not create component [" + str + "] of type [" + subst + "]", e11);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        String str2;
        IADataForComplexProperty pop = this.actionDataStack.pop();
        if (pop.inError) {
            return;
        }
        PropertySetter propertySetter = new PropertySetter(pop.getNestedComplexProperty());
        propertySetter.setContext(this.context);
        if (propertySetter.computeAggregationType("parent") == AggregationType.AS_COMPLEX_PROPERTY) {
            propertySetter.setComplexProperty("parent", pop.parentBean.getObj());
        }
        Object nestedComplexProperty = pop.getNestedComplexProperty();
        if ((nestedComplexProperty instanceof LifeCycle) && NoAutoStartUtil.notMarkedWithNoAutoStart(nestedComplexProperty)) {
            ((LifeCycle) nestedComplexProperty).start();
        }
        if (interpretationContext.peekObject() != pop.getNestedComplexProperty()) {
            str2 = "The object on the top the of the stack is not the component pushed earlier.";
        } else {
            interpretationContext.popObject();
            int i11 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[pop.aggregationType.ordinal()];
            if (i11 == 4) {
                pop.parentBean.addComplexProperty(str, pop.getNestedComplexProperty());
                return;
            } else if (i11 == 5) {
                pop.parentBean.setComplexProperty(str, pop.getNestedComplexProperty());
                return;
            } else {
                str2 = "Unexpected aggregationType " + pop.aggregationType;
            }
        }
        addError(str2);
    }

    @Override // ch.qos.logback.core.joran.action.ImplicitAction
    public boolean isApplicable(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        String peekLast = elementPath.peekLast();
        if (interpretationContext.isEmpty()) {
            return false;
        }
        PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
        propertySetter.setContext(this.context);
        AggregationType computeAggregationType = propertySetter.computeAggregationType(peekLast);
        int i11 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[computeAggregationType.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return false;
        }
        if (i11 == 4 || i11 == 5) {
            this.actionDataStack.push(new IADataForComplexProperty(propertySetter, computeAggregationType, peekLast));
            return true;
        }
        addError("PropertySetter.computeAggregationType returned " + computeAggregationType);
        return false;
    }
}
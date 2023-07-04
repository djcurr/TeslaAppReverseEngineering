package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public class PropertySetter extends ContextAwareBase {
    protected MethodDescriptor[] methodDescriptors;
    protected Object obj;
    protected Class<?> objClass;
    protected PropertyDescriptor[] propertyDescriptors;

    /* renamed from: ch.qos.logback.core.joran.util.PropertySetter$1  reason: invalid class name */
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
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PropertySetter(Object obj) {
        this.obj = obj;
        this.objClass = obj.getClass();
    }

    private String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    private AggregationType computeRawAggregationType(Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        return parameterClassForMethod == null ? AggregationType.NOT_FOUND : StringToObjectConverter.canBeBuiltFromSimpleString(parameterClassForMethod) ? AggregationType.AS_BASIC_PROPERTY : AggregationType.AS_COMPLEX_PROPERTY;
    }

    private Method findAdderMethod(String str) {
        String capitalizeFirstLetter = capitalizeFirstLetter(str);
        return getMethod("add" + capitalizeFirstLetter);
    }

    private Method findSetterMethod(String str) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getWriteMethod();
        }
        return null;
    }

    private Class<?> getParameterClassForMethod(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    private boolean isSanityCheckSuccessful(String str, Method method, Class<?>[] clsArr, Object obj) {
        String str2;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            str2 = "Wrong number of parameters in setter method for property [" + str + "] in " + this.obj.getClass().getName();
        } else if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        } else {
            addError("A \"" + cls.getName() + "\" object is not assignable to a \"" + clsArr[0].getName() + "\" variable.");
            addError("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            addError("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            str2 = "\"" + cls.getName() + "\" was loaded by [" + cls.getClassLoader() + "].";
        }
        addError(str2);
        return false;
    }

    private boolean isUnequivocallyInstantiable(Class<?> cls) {
        if (cls.isInterface()) {
            return false;
        }
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) != null;
    }

    public void addBasicProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String capitalizeFirstLetter = capitalizeFirstLetter(str);
        Method findAdderMethod = findAdderMethod(capitalizeFirstLetter);
        if (findAdderMethod == null) {
            addError("No adder for property [" + capitalizeFirstLetter + "].");
            return;
        }
        Class<?>[] parameterTypes = findAdderMethod.getParameterTypes();
        isSanityCheckSuccessful(capitalizeFirstLetter, findAdderMethod, parameterTypes, str2);
        try {
            if (StringToObjectConverter.convertArg(this, str2, parameterTypes[0]) != null) {
                invokeMethodWithSingleParameterOnThisObject(findAdderMethod, str2);
            }
        } catch (Throwable th2) {
            addError("Conversion to type [" + parameterTypes[0] + "] failed. ", th2);
        }
    }

    public void addComplexProperty(String str, Object obj) {
        Method findAdderMethod = findAdderMethod(str);
        if (findAdderMethod != null) {
            if (isSanityCheckSuccessful(str, findAdderMethod, findAdderMethod.getParameterTypes(), obj)) {
                invokeMethodWithSingleParameterOnThisObject(findAdderMethod, obj);
                return;
            }
            return;
        }
        addError("Could not find method [add" + str + "] in class [" + this.objClass.getName() + "].");
    }

    public AggregationType computeAggregationType(String str) {
        Method findAdderMethod = findAdderMethod(str);
        if (findAdderMethod != null) {
            AggregationType computeRawAggregationType = computeRawAggregationType(findAdderMethod);
            int i11 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[computeRawAggregationType.ordinal()];
            if (i11 == 1) {
                return AggregationType.NOT_FOUND;
            }
            if (i11 == 2) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (i11 == 3) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (i11 == 4 || i11 == 5) {
                addError("Unexpected AggregationType " + computeRawAggregationType);
            }
        }
        Method findSetterMethod = findSetterMethod(str);
        return findSetterMethod != null ? computeRawAggregationType(findSetterMethod) : AggregationType.NOT_FOUND;
    }

    <T extends Annotation> T getAnnotation(String str, Class<T> cls, Method method) {
        if (method != null) {
            return (T) method.getAnnotation(cls);
        }
        return null;
    }

    Class<?> getByConcreteType(String str, Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod != null && isUnequivocallyInstantiable(parameterClassForMethod)) {
            return parameterClassForMethod;
        }
        return null;
    }

    public Class<?> getClassNameViaImplicitRules(String str, AggregationType aggregationType, DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        Class<?> findDefaultComponentType = defaultNestedComponentRegistry.findDefaultComponentType(this.obj.getClass(), str);
        if (findDefaultComponentType != null) {
            return findDefaultComponentType;
        }
        Method relevantMethod = getRelevantMethod(str, aggregationType);
        if (relevantMethod == null) {
            return null;
        }
        Class<?> defaultClassNameByAnnonation = getDefaultClassNameByAnnonation(str, relevantMethod);
        return defaultClassNameByAnnonation != null ? defaultClassNameByAnnonation : getByConcreteType(str, relevantMethod);
    }

    Class<?> getDefaultClassNameByAnnonation(String str, Method method) {
        DefaultClass defaultClass = (DefaultClass) getAnnotation(str, DefaultClass.class, method);
        if (defaultClass != null) {
            return defaultClass.value();
        }
        return null;
    }

    protected Method getMethod(String str) {
        if (this.methodDescriptors == null) {
            introspect();
        }
        int i11 = 0;
        while (true) {
            MethodDescriptor[] methodDescriptorArr = this.methodDescriptors;
            if (i11 >= methodDescriptorArr.length) {
                return null;
            }
            if (str.equals(methodDescriptorArr[i11].getName())) {
                return this.methodDescriptors[i11].getMethod();
            }
            i11++;
        }
    }

    public Object getObj() {
        return this.obj;
    }

    public Class<?> getObjClass() {
        return this.objClass;
    }

    protected PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.propertyDescriptors == null) {
            introspect();
        }
        int i11 = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.propertyDescriptors;
            if (i11 >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i11].getName())) {
                return this.propertyDescriptors[i11];
            }
            i11++;
        }
    }

    Method getRelevantMethod(String str, AggregationType aggregationType) {
        String capitalizeFirstLetter = capitalizeFirstLetter(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return findAdderMethod(capitalizeFirstLetter);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return findSetterMethod(capitalizeFirstLetter);
        }
        throw new IllegalStateException(aggregationType + " not allowed here");
    }

    protected void introspect() {
        try {
            this.propertyDescriptors = Introspector.getPropertyDescriptors(this.objClass);
            this.methodDescriptors = Introspector.getMethodDescriptors(this.objClass);
        } catch (IntrospectionException e11) {
            addError("Failed to introspect " + this.obj + ": " + e11.getMessage());
            this.propertyDescriptors = new PropertyDescriptor[0];
            this.methodDescriptors = new MethodDescriptor[0];
        }
    }

    void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.obj, obj);
        } catch (Exception e11) {
            addError("Could not invoke method " + method.getName() + " in class " + this.obj.getClass().getName() + " with parameter of type " + cls.getName(), e11);
        }
    }

    public void setComplexProperty(String str, Object obj) {
        StringBuilder sb2;
        Class<?> cls;
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor == null) {
            sb2 = new StringBuilder();
            sb2.append("Could not find PropertyDescriptor for [");
            sb2.append(str);
            sb2.append("] in ");
            cls = this.objClass;
        } else {
            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                if (isSanityCheckSuccessful(str, writeMethod, writeMethod.getParameterTypes(), obj)) {
                    try {
                        invokeMethodWithSingleParameterOnThisObject(writeMethod, obj);
                        return;
                    } catch (Exception e11) {
                        addError("Could not set component " + this.obj + " for parent component " + this.obj, e11);
                        return;
                    }
                }
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Not setter method for property [");
            sb2.append(str);
            sb2.append("] in ");
            cls = this.obj.getClass();
        }
        sb2.append(cls.getName());
        addWarn(sb2.toString());
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            throw new PropertySetterException("No setter for property [" + str + "].");
        }
        Class<?>[] parameterTypes = writeMethod.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new PropertySetterException("#params for setter != 1");
        }
        try {
            Object convertArg = StringToObjectConverter.convertArg(this, str2, parameterTypes[0]);
            if (convertArg != null) {
                try {
                    writeMethod.invoke(this.obj, convertArg);
                    return;
                } catch (Exception e11) {
                    throw new PropertySetterException(e11);
                }
            }
            throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed.");
        } catch (Throwable th2) {
            throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed. ", th2);
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String decapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(decapitalize);
        if (propertyDescriptor == null) {
            addWarn("No such property [" + decapitalize + "] in " + this.objClass.getName() + ".");
            return;
        }
        try {
            setProperty(propertyDescriptor, decapitalize, str2);
        } catch (PropertySetterException e11) {
            addWarn("Failed to set property [" + decapitalize + "] to value \"" + str2 + "\". ", e11);
        }
    }
}
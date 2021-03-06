/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class ImmUnusedGeneric<T> implements ImmutableBean {

    @PropertyDefinition(validate = "notNull")
    private final String _errorMessage;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmUnusedGeneric}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static ImmUnusedGeneric.Meta meta() {
        return ImmUnusedGeneric.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code ImmUnusedGeneric}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R> ImmUnusedGeneric.Meta<R> metaImmUnusedGeneric(Class<R> cls) {
        return ImmUnusedGeneric.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmUnusedGeneric.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <T>  the type
     * @return the builder, not null
     */
    public static <T> ImmUnusedGeneric.Builder<T> builder() {
        return new ImmUnusedGeneric.Builder<T>();
    }

    private ImmUnusedGeneric(
            String _errorMessage) {
        JodaBeanUtils.notNull(_errorMessage, "_errorMessage");
        this._errorMessage = _errorMessage;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ImmUnusedGeneric.Meta<T> metaBean() {
        return ImmUnusedGeneric.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the _errorMessage.
     * @return the value of the property, not null
     */
    public String get_errorMessage() {
        return _errorMessage;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<T> toBuilder() {
        return new Builder<T>(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmUnusedGeneric<?> other = (ImmUnusedGeneric<?>) obj;
            return JodaBeanUtils.equal(get_errorMessage(), other.get_errorMessage());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(get_errorMessage());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("ImmUnusedGeneric{");
        buf.append("_errorMessage").append('=').append(JodaBeanUtils.toString(get_errorMessage()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmUnusedGeneric}.
     * @param <T>  the type
     */
    public static final class Meta<T> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code _errorMessage} property.
         */
        private final MetaProperty<String> _errorMessage = DirectMetaProperty.ofImmutable(
                this, "_errorMessage", ImmUnusedGeneric.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "_errorMessage");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -900245826:  // _errorMessage
                    return _errorMessage;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmUnusedGeneric.Builder<T> builder() {
            return new ImmUnusedGeneric.Builder<T>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends ImmUnusedGeneric<T>> beanType() {
            return (Class) ImmUnusedGeneric.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code _errorMessage} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> _errorMessage() {
            return _errorMessage;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -900245826:  // _errorMessage
                    return ((ImmUnusedGeneric<?>) bean).get_errorMessage();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmUnusedGeneric}.
     * @param <T>  the type
     */
    public static final class Builder<T> extends DirectFieldsBeanBuilder<ImmUnusedGeneric<T>> {

        private String _errorMessage;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmUnusedGeneric<T> beanToCopy) {
            this._errorMessage = beanToCopy.get_errorMessage();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -900245826:  // _errorMessage
                    return _errorMessage;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -900245826:  // _errorMessage
                    this._errorMessage = (String) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<T> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder<T> setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder<T> setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        @Override
        public Builder<T> setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmUnusedGeneric<T> build() {
            return new ImmUnusedGeneric<T>(
                    _errorMessage);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the {@code _errorMessage} property in the builder.
         * @param _errorMessage  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<T> _errorMessage(String _errorMessage) {
            JodaBeanUtils.notNull(_errorMessage, "_errorMessage");
            this._errorMessage = _errorMessage;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(64);
            buf.append("ImmUnusedGeneric.Builder{");
            buf.append("_errorMessage").append('=').append(JodaBeanUtils.toString(_errorMessage));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}

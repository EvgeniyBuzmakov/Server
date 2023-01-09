/*
 * An XML document type.
 * Localname: message
 * Namespace: 
 * Java type: noNamespace.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one message(@) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessageDocument {
    private static final long serialVersionUID = 1L;

    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "message"),
    };


    /**
     * Gets the "message" element
     */
    @Override
    public noNamespace.MessageDocument.Message getMessage() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.MessageDocument.Message target = null;
            target = (noNamespace.MessageDocument.Message)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "message" element
     */
    @Override
    public void setMessage(noNamespace.MessageDocument.Message message) {
        generatedSetterHelperImpl(message, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "message" element
     */
    @Override
    public noNamespace.MessageDocument.Message addNewMessage() {
        synchronized (monitor()) {
            check_orphaned();
            noNamespace.MessageDocument.Message target = null;
            target = (noNamespace.MessageDocument.Message)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML message(@).
     *
     * This is a complex type.
     */
    public static class MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessageDocument.Message {
        private static final long serialVersionUID = 1L;

        public MessageImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "header"),
            new QName("", "body"),
        };


        /**
         * Gets the "header" element
         */
        @Override
        public noNamespace.MessageDocument.Message.Header getHeader() {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.MessageDocument.Message.Header target = null;
                target = (noNamespace.MessageDocument.Message.Header)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                return (target == null) ? null : target;
            }
        }

        /**
         * Sets the "header" element
         */
        @Override
        public void setHeader(noNamespace.MessageDocument.Message.Header header) {
            generatedSetterHelperImpl(header, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "header" element
         */
        @Override
        public noNamespace.MessageDocument.Message.Header addNewHeader() {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.MessageDocument.Message.Header target = null;
                target = (noNamespace.MessageDocument.Message.Header)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Gets the "body" element
         */
        @Override
        public noNamespace.MessageDocument.Message.Body getBody() {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.MessageDocument.Message.Body target = null;
                target = (noNamespace.MessageDocument.Message.Body)get_store().find_element_user(PROPERTY_QNAME[1], 0);
                return (target == null) ? null : target;
            }
        }

        /**
         * Sets the "body" element
         */
        @Override
        public void setBody(noNamespace.MessageDocument.Message.Body body) {
            generatedSetterHelperImpl(body, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "body" element
         */
        @Override
        public noNamespace.MessageDocument.Message.Body addNewBody() {
            synchronized (monitor()) {
                check_orphaned();
                noNamespace.MessageDocument.Message.Body target = null;
                target = (noNamespace.MessageDocument.Message.Body)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }
        /**
         * An XML header(@).
         *
         * This is an atomic type that is a restriction of noNamespace.MessageDocument$Message$Header.
         */
        public static class HeaderImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.MessageDocument.Message.Header {
            private static final long serialVersionUID = 1L;

            public HeaderImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, true);
            }

            protected HeaderImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }

            private static final QName[] PROPERTY_QNAME = {
                new QName("", "time"),
            };


            /**
             * Gets the "time" attribute
             */
            @Override
            public java.lang.String getTime() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "time" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetTime() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    return target;
                }
            }

            /**
             * True if has "time" attribute
             */
            @Override
            public boolean isSetTime() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
                }
            }

            /**
             * Sets the "time" attribute
             */
            @Override
            public void setTime(java.lang.String time) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                    }
                    target.setStringValue(time);
                }
            }

            /**
             * Sets (as xml) the "time" attribute
             */
            @Override
            public void xsetTime(org.apache.xmlbeans.XmlString time) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                    }
                    target.set(time);
                }
            }

            /**
             * Unsets the "time" attribute
             */
            @Override
            public void unsetTime() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[0]);
                }
            }
        }
        /**
         * An XML body(@).
         *
         * This is a complex type.
         */
        public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessageDocument.Message.Body {
            private static final long serialVersionUID = 1L;

            public BodyImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType);
            }

            private static final QName[] PROPERTY_QNAME = {
                new QName("", "text"),
            };


            /**
             * Gets the "text" element
             */
            @Override
            public java.lang.String getText() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "text" element
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetText() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                    return target;
                }
            }

            /**
             * Sets the "text" element
             */
            @Override
            public void setText(java.lang.String text) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                    }
                    target.setStringValue(text);
                }
            }

            /**
             * Sets (as xml) the "text" element
             */
            @Override
            public void xsetText(org.apache.xmlbeans.XmlString text) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                    }
                    target.set(text);
                }
            }
        }
    }
}

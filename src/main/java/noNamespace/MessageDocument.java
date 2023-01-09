/*
 * An XML document type.
 * Localname: message
 * Namespace: 
 * Java type: noNamespace.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one message(@) element.
 *
 * This is a complex type.
 */
public interface MessageDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<noNamespace.MessageDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sE51A730E2EA007B016DEC6E8F7ADF121.TypeSystemHolder.typeSystem, "message2d6edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "message" element
     */
    noNamespace.MessageDocument.Message getMessage();

    /**
     * Sets the "message" element
     */
    void setMessage(noNamespace.MessageDocument.Message message);

    /**
     * Appends and returns a new empty "message" element
     */
    noNamespace.MessageDocument.Message addNewMessage();

    /**
     * An XML message(@).
     *
     * This is a complex type.
     */
    public interface Message extends org.apache.xmlbeans.XmlObject {
        ElementFactory<noNamespace.MessageDocument.Message> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sE51A730E2EA007B016DEC6E8F7ADF121.TypeSystemHolder.typeSystem, "message3231elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "header" element
         */
        noNamespace.MessageDocument.Message.Header getHeader();

        /**
         * Sets the "header" element
         */
        void setHeader(noNamespace.MessageDocument.Message.Header header);

        /**
         * Appends and returns a new empty "header" element
         */
        noNamespace.MessageDocument.Message.Header addNewHeader();

        /**
         * Gets the "body" element
         */
        noNamespace.MessageDocument.Message.Body getBody();

        /**
         * Sets the "body" element
         */
        void setBody(noNamespace.MessageDocument.Message.Body body);

        /**
         * Appends and returns a new empty "body" element
         */
        noNamespace.MessageDocument.Message.Body addNewBody();

        /**
         * An XML header(@).
         *
         * This is an atomic type that is a restriction of noNamespace.MessageDocument$Message$Header.
         */
        public interface Header extends org.apache.xmlbeans.XmlString {
            ElementFactory<noNamespace.MessageDocument.Message.Header> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sE51A730E2EA007B016DEC6E8F7ADF121.TypeSystemHolder.typeSystem, "header92caelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            /**
             * Gets the "time" attribute
             */
            java.lang.String getTime();

            /**
             * Gets (as xml) the "time" attribute
             */
            org.apache.xmlbeans.XmlString xgetTime();

            /**
             * True if has "time" attribute
             */
            boolean isSetTime();

            /**
             * Sets the "time" attribute
             */
            void setTime(java.lang.String time);

            /**
             * Sets (as xml) the "time" attribute
             */
            void xsetTime(org.apache.xmlbeans.XmlString time);

            /**
             * Unsets the "time" attribute
             */
            void unsetTime();
        }

        /**
         * An XML body(@).
         *
         * This is a complex type.
         */
        public interface Body extends org.apache.xmlbeans.XmlObject {
            ElementFactory<noNamespace.MessageDocument.Message.Body> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sE51A730E2EA007B016DEC6E8F7ADF121.TypeSystemHolder.typeSystem, "body0f5felemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            /**
             * Gets the "text" element
             */
            java.lang.String getText();

            /**
             * Gets (as xml) the "text" element
             */
            org.apache.xmlbeans.XmlString xgetText();

            /**
             * Sets the "text" element
             */
            void setText(java.lang.String text);

            /**
             * Sets (as xml) the "text" element
             */
            void xsetText(org.apache.xmlbeans.XmlString text);
        }
    }
}

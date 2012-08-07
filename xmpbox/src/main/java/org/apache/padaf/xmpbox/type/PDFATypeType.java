/*****************************************************************************
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 ****************************************************************************/

package org.apache.padaf.xmpbox.type;

import org.apache.padaf.xmpbox.XMPMetadata;
import org.apache.padaf.xmpbox.XmpConstants;

public class PDFATypeType extends AbstractStructuredType {

    public static final String ELEMENT_NS = "http://www.aiim.org/pdfa/ns/type#";

    public static final String PREFERED_PREFIX = "pdfaType";


	@PropertyType(propertyType = "Text")
	public static final String TYPE = "type";

	@PropertyType(propertyType = "URI")
	public static final String NS_URI = "namespaceURI";

	@PropertyType(propertyType = "Text")
	public static final String PREFIX = "prefix";

	@PropertyType(propertyType = "Text")
	public static final String DESCRIPTION = "description";

	@PropertyType(propertyType = "seq PDFAField")
	public static final String FIELD = "field";

	public PDFATypeType(XMPMetadata metadata) {
		super(metadata, XmpConstants.RDF_NAMESPACE, PREFERED_PREFIX);
	}

	@Override
	public String getFieldsNamespace() {
		return ELEMENT_NS;
	}

	public String getNamespaceURI() {
		URIType tt = (URIType) getProperty(NS_URI);
		return tt == null ? null : tt.getStringValue();
	}

	public String getType() {
		TextType tt = (TextType) getProperty(TYPE);
		return tt == null ? null : tt.getStringValue();
	}

	public String getPrefix() {
		TextType tt = (TextType) getProperty(PREFIX);
		return tt == null ? null : tt.getStringValue();
	}

	public String getDescription() {
		TextType tt = (TextType) getProperty(DESCRIPTION);
		return tt == null ? null : tt.getStringValue();
	}

	public ArrayProperty getFields() {
		return (ArrayProperty) getArrayProperty(FIELD);
	}


	
	
}

/*******************************************************************************
 * (c) Copyright 2019 Micro Focus or one of its affiliates. 
 * 
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://opensource.org/licenses/MIT
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.fortify.plugin.jenkins.fortifyclient.schemawrapper;

import javax.xml.datatype.XMLGregorianCalendar;

public class Comment {

	private com.fortify.plugin.jenkins.model.ui.Comment comment;

	public Comment(com.fortify.plugin.jenkins.model.ui.Comment comment) {
		this.comment = comment;
	}

	public String getConent() {
		return comment.getContent();
	}

	public String getUsername() {
		return comment.getUsername();
	}

	public XMLGregorianCalendar getTimestamp() {
		return comment.getTimestamp();
	}
}

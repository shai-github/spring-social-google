/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.google.api.calendar.impl;

import java.text.MessageFormat;

import org.springframework.social.google.api.calendar.DeleteEventBuilder;
import static org.springframework.social.google.api.query.impl.ApiQueryBuilderImpl.encode;

/**
 * {@link DeleteEventBuilder} implementation.
 * 
 * @author Martin Wink
 */
public class DeleteEventBuilderImpl extends UriQueryBuilderImpl<DeleteEventBuilder, Object> implements DeleteEventBuilder {
	public DeleteEventBuilderImpl(String urlTemplate, String calendarId, String eventId) {
		super(MessageFormat.format(urlTemplate, encode(calendarId), encode(eventId)));
	}

	public DeleteEventBuilder sendNotifications(boolean sendNotifications) {
		return appendQueryParam("sendNotifications", sendNotifications);
	}
}

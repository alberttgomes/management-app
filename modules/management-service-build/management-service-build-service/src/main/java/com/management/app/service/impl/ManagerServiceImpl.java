/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.management.app.service.impl;

import com.liferay.portal.aop.AopService;

import com.management.app.service.base.ManagerServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Albert Cabral
 */
@Component(
	property = {
		"json.web.service.context.name=management",
		"json.web.service.context.path=Manager"
	},
	service = AopService.class
)
public class ManagerServiceImpl extends ManagerServiceBaseImpl {
}
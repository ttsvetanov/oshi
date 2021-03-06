/**
 * Oshi (https://github.com/oshi/oshi)
 *
 * Copyright (c) 2010 - 2018 The Oshi Project Team
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Maintainers:
 * dblock[at]dblock[dot]org
 * widdis[at]gmail[dot]com
 * enrico.bianchi[at]gmail[dot]com
 *
 * Contributors:
 * https://github.com/oshi/oshi/graphs/contributors
 */
package oshi.json.hardware;

import org.threeten.bp.LocalDate;

import oshi.json.json.OshiJsonObject;

/**
 * The Firmware represents the low level BIOS or equivalent
 *
 * @author SchiTho1 [at] Securiton AG
 */
public interface Firmware extends OshiJsonObject {

    String getManufacturer();

    String getName();

    String getDescription();

    String getVersion();

    LocalDate getReleaseDate();
}

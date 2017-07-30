/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.somfytahoma.model;

/**
 * The {@link SomfyTahomaSetupResponse} holds information about
 * response to getting devices setup command.
 *
 * @author Ondrej Pecta - Initial contribution
 */
public class SomfyTahomaSetupResponse {

    private SomfyTahomaSetup setup;

    public SomfyTahomaSetup getSetup() {
        return setup;
    }
}
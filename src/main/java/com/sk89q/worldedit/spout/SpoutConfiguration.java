/*
 * WorldEdit
 * Copyright (C) 2012 sk89q <http://www.sk89q.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.spout;

import com.sk89q.util.yaml.YAMLProcessor;
import com.sk89q.worldedit.util.YAMLConfiguration;

import java.io.File;
import java.util.logging.Logger;

/**
 * @author zml2008
 */
public class SpoutConfiguration extends YAMLConfiguration {
    private final WorldEditPlugin plugin;
    public SpoutConfiguration(YAMLProcessor config, WorldEditPlugin plugin) {
        super(config, plugin.getLogger());
        this.plugin = plugin;
    }

    @Override
    public File getWorkingDirectory() {
        return plugin.getDataFolder();
    }
}

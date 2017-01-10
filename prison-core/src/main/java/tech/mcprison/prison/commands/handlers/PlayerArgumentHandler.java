/*
 *  Prison is a Minecraft plugin for the prison game mode.
 *  Copyright (C) 2016 The Prison Team
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tech.mcprison.prison.commands.handlers;

import tech.mcprison.prison.Prison;
import tech.mcprison.prison.commands.*;
import tech.mcprison.prison.internal.CommandSender;
import tech.mcprison.prison.internal.Player;

public class PlayerArgumentHandler extends ArgumentHandler<Player> {
    public PlayerArgumentHandler() {
        setMessage("player_not_online", Prison.get().getMessages().playerNotOnline);

        addVariable("sender", "The command executor", new ArgumentVariable<Player>() {
            @Override
            public Player var(CommandSender sender, CommandArgument argument, String varName)
                throws CommandError {
                if (!(sender instanceof Player)) {
                    throw new CommandError(argument.getMessage("cant_as_console"));
                }

                return ((Player) sender);
            }
        });
    }

    @Override public Player transform(CommandSender sender, CommandArgument argument, String value)
        throws TransformError {
        Player p = Prison.get().getPlatform().getPlayer(value);
        if (p == null) {
            throw new TransformError(argument.getMessage("player_not_online", value));
        }
        return p;
    }
}

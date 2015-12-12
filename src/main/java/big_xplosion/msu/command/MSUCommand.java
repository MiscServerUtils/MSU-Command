package big_xplosion.msu.command;

import big_xplosion.msu.command.lib.Constants;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = Constants.PLUGIN_ID, name = Constants.PLUGIN_NAME, version = Constants.PLUGIN_VERSION)
public class MSUCommand {

	private static MSUCommand plugin;
	private Game game;

	@Listener
	public void preInit(GamePreInitializationEvent event) {
		plugin = this;
		game = event.getGame();
	}

	public static MSUCommand getPlugin() {
		return plugin;
	}

	public Game getGame() {
		return game;
	}
}

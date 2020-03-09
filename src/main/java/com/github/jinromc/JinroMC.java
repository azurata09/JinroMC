package com.github.jinromc;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

class JinroMC extends JavaPlugin {

  public static final Logger logger;

  @Override
  public void onEnable() {
    logger = getLogger();
    logger.info("Plugin is Enabled");
  }

  @Override
  public void onDisable() {
    logger.info("Plugin is Disabled");
    logger.info("If this message show on unexpected timing, Please contact to developer")
  }
}

package com.github.srain3.sample

import org.bukkit.plugin.java.JavaPlugin

/**
 * Sampleプラグイン、これがプラグインにとってMainクラスになる。
 */
class Main: JavaPlugin() {
  // プラグインが起動するとき
  override fun onEnable() {
    this.logger.info("Hello World!")
  }

  // プラグインが終了するとき
  override fun onDisable() {
    this.logger.info("Goodbye!")
  }
}
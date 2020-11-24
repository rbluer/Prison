# WARNING : This project is grossly out of date.
Please go back to the original project at https://github.com/PrisonTeam/Prison and use that version.

I have abandoned this fork because I am now the lead developer on the original project.  This fork became release v3.2.0 within the main project.

I've added so may new features and enhancements to the main project that I cannot begin to list them all.  Please see the change log and the documentation through the table of contents, both of which are accessible through hyperlinks on that project's readme file.


Some highlights:
* **Tab Complete is now part of the prison command handler**
* **All commmands now can specify alt perms and even aliases**
* **Over 100 placeholders, including aliases.**  Includes mine, rank, player, and player-mine placeholders.
* **Supports Spigot 1.8 through 1.16 and higher!**
* **Now includes a built in GUI, auto manager for auto pickup, auto smelt, and auto block. Also include a sellall command too**
* **New Auto Configure to setup all ranks A through Z and mines A through Z, links mines to their ranks, sets up the basic perms, and adds default blocks to all mines in increasing order of value**.  Auto Configure can get you started with a new prison server by generating all of this in less than 1 minute.
* **New features to move and resize mines with auto repairs to surrounding blocks**
* **New feature to wrap the mine in a patterned liner that includes ladders in each wall.**
* **For huge mines there is an optional paging feature for resets**.  Even with multi-million block mines, your server will not lag when it resets.
* **Mines now manage their own workflows.** They are independant tasks that are self-aware of its own environment and is able to react to zero blocks, or thresholds.  Each mine manages it's own reset schedule so each mine can operate on it's own.
* **Many new mine and rank commands.  New Prestige ladder too.**

* **Coming soon: Custom block support and full block support of every type in every version of all Spigot versions!**


Lastly, if you need help with anything, please visit the Prison's discord server.  We'd be happy to help. :)

  - Blue


<hr />



[![Documentation](https://static.ultz.co.uk/PrisonMoveDoc.png)](https://confluence.onultz.com/display/PRIS)
![Prison Banner](https://faizaand.github.io/prison/img/prison-banner.png)

[![License](https://img.shields.io/badge/license-GPL%20License%20v3-blue.svg)](LICENSE.md)
[![Build Status](https://travis-ci.org/MC-Prison/Prison.svg?branch=master)](https://travis-ci.org/MC-Prison/Prison)
[![Discord](https://discordapp.com/api/guilds/332602419483770890/widget.png)](https://discord.gg/396ed5F)

1. [What is Prison?](#what-is-prison)
2. [Why should I use Prison?](#why-should-i-use-prison)
3. [Get Prison](#get-prison)

## What is Prison?

Prison is a Minecraft plugin that adds all the features necessary for [prison servers](https://woodycraft.net/threads/what-is-a-prison-server-a-general-explanation.21161/). It runs on multiple platforms, including the popular [Spigot](http://spigotmc.org) and the rapidly growing [Sponge](http://spongepowered.org). Plugins for prison servers exist already, but many of them are poorly maintained, and the solid ones are paid resources. Prison eliminates the paywall and the updating hassle, and puts a one-stop solution in their place.

### History of Prison

Prison began as a plugin with the goal of combining two main prison server features: resetting mines and purchasable ranks. In June 2014, Prison v2.0 was released with the goal of providing a single solution for prison servers. Prison v2.0 has had numerous problems and is not the solution that we had envisioned for an all-in-one package to be. The solution is the current version - Prison v3.0.

## Why should I use Prison?

If hassle-free updates and zero payments is not enough for you to consider switching to Prison, it doesn't stop there.

* **Prison is modular.** If you don't want to use a certain feature on your server, you can disable it in just a few keystrokes.
* **Prison is completely, 100% open source.** This means that your developers can make changes to the plugin to customize your server's experience, if you so desire.
* **Prison is and always will be free.** While we do ask for donations, all of our code, resources, and binaries are provided free of charge to the Minecraft community.
* **New releases are heavily bug-tested.** We test every single aspect of every new release of Prison before releasing it to the community. If a release doesn't pass our rigorous update checklist, it is iterated upon until it does. What does this mean for you? Solid updates with minimal bugs for your server.
* **Prison is always expanding.** We are always looking for ways to expand Prison with features that make your server run more smoothly. Additionally, we are always looking for contributions from the community, be it code contributions, feature requests, bug reports, translations, or documentation.

## Get Prison

**Note as of version 3.5.0** the build artifacts can be found under "code / releases" 
within this GitHub fork. At this time I'm not sure if the build artifacts will ever be 
hosted on a third party repository.


 
Note: The following builds have not been hooked up yet for this fork, and therefore do not work.
| Stable | Experimental (Nightly) |
| ------ | ---------------------- |
| [![Stable Download](https://img.shields.io/badge/download-stable-44cc11.svg)](https://github.com/MC-Prison/Prison/releases/latest) | [![Experimental Download](https://img.shields.io/badge/download-experimental-red.svg)](https://ci.appveyor.com/project/faizaand/prison/build/artifacts) | 

## More Information on this Fork and the Current Project

You can find more information about the progress of this project within the following resources:


- <a href="changelog_v3.5.x.md">changelog_v3.5.x.md</a>
- <a href="test-plans/test-plans-README.md">test-plans-README.md</a>
- <a href="test-plans/test-plans-prison-mine.md">test-plans-prison-mine.md</a>

I created a resource page on 
[SpigotMC.org - Prison - The Updated Edition](https://www.spigotmc.org/resources/prison-the-updated-edition.72740/) too. 
I'll be posting build artifacts there as they are generated.


 

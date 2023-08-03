# MxTeleport Plugin

## Overview

MxTeleport is a versatile Bukkit plugin designed to provide teleportation functionality for players within the same world. This plugin allows server administrators to define and manage multiple predefined locations, enabling players to easily teleport to these locations using simple commands.

With MxTeleport, players no longer need to manually traverse long distances or navigate complex terrain. Whether you're running a survival server, a creative server, or any other type of Bukkit server, MxTeleport will enhance the teleportation experience for your players.

## Features

- Define and manage multiple teleportation locations within the same world.
- Simple and intuitive commands for players to teleport to predefined locations.
- Enhanced server experience by reducing travel time and effort.
- Easy installation and integration with existing Bukkit servers.

## How to Install

1. Build the main class with your JDK.
2. Place the downloaded `MxTeleport.jar` file into the `plugins` folder of your Bukkit server.
3. Restart your server to enable the MxTeleport plugin.

## Commands

- `/teleport <location>` - Teleports the player to the specified location within the same world.

## Permissions

- `mxteleport.use` - Allows players to use the `/teleport` command.

## How to Use

1. Ensure you have the `mxteleport.use` permission to use the `/teleport` command.
2. In the game, enter the command `/teleport <location>` where `<location>` is the name of the predefined location you want to teleport to.
3. You will be teleported to the specified location within the same world.

## Configuring Predefined Locations

To configure predefined locations for teleportation, follow these steps:

1. Access the `plugins/MxTeleport` folder on your server.
2. Open the `config.yml` file using a text editor.
3. Add or edit locations as needed using the following format:

```yaml
locations:
  location1:
    world: world_name
    x: x_coordinate
    y: y_coordinate
    z: z_coordinate
  location2:
    world: world_name
    x: x_coordinate
    y: y_coordinate
    z: z_coordinate
```

Make sure to replace `location1`, `location2`, etc., with the desired location names. Replace `world_name`, `x_coordinate`, `y_coordinate`, and `z_coordinate` with the corresponding values for each location.

## Contributing
We welcome contributions to improve MxTeleport. To contribute, follow these steps:

1. Fork this repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push the changes to your fork.
5. Submit a pull request to this repository.

## License
MxTeleport is licensed under the MIT License.

Support
For any issues or questions related to the MxTeleport plugin, please open a GitHub issue or contact us at support@example.com.

Credits
MxTeleport was created by mxtheuz. Special thanks to the Bukkit community for their contributions and support.
Thank you for using MxTeleport! We hope it enhances your Bukkit server experience. Happy teleporting!

<hr>

Could you follow me? ❤

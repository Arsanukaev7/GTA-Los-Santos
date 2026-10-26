# GTA Los Santos — Fabric 1.20.4 (prototype 0.1.0)

An original Minecraft city-life and driving mod inspired by open-world games.
This project does not include GTA V game files, maps, logos, models, sounds, or other Rockstar assets.

## Current prototype
- Registers a Los Santos Phone item.
- Adds the phone to the Tools creative tab.
- Includes a GitHub Actions workflow that builds the JAR automatically.

## Requirements
- Minecraft Java Edition 1.20.4
- Fabric Loader 0.15.x or compatible
- Fabric API for Minecraft 1.20.4
- Java 17

## Automatic build on GitHub
After uploading the project to a GitHub repository:
1. Open the repository's **Actions** tab.
2. Select **Build Los Santos mod**.
3. Press **Run workflow** (or push a commit to `main`).
4. When the run finishes, open it and download the `los-santos-mod` artifact.

The artifact contains the built JAR. Put the JAR in the Minecraft `mods` folder together with Fabric API.

## Current scope
This is an initial working project scaffold with one registered in-game item, not a complete GTA V recreation yet. Vehicles, phone GUI, money, missions, NPCs and city content are planned for later updates.

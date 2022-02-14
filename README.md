# DxfWriter

## Introduction

- Write .dxf file without AutoCAD.
- Based on [Kabeja](https://github.com/fuzziness/kabeja).

## Functions

- Output your program results in dxf file directly.

## Supported Elements
Current:
- line2d
- line3d
- polyline
- circle
- hatch
- text
- layer (and its color)

TODO:
- block

## Dependences

- [He_mesh](https://github.com/wblut/HE_Mesh)
- [Kabeja](https://github.com/fuzziness/kabeja)
- [DXFImporter](https://github.com/Naturalpowder)

## How to use

Init file save path:

```java
        String path="file save path";
```

Operations:

```java
        op=new DxfOP();

        (Your operations here)

        op.save(path);
```

You can find a **Demo** in the package *dxfWriter*.

## Contributors
This project exists thanks to all the people who contribute.

[Bingqi Wang(AlessioWang)](https://github.com/AlessioWang)

[Naturalpowder](https://github.com/Naturalpowder)













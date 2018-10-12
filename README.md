# hawk-neoemf-models-2018-tutorial

The repository containing materials associated to the Hawk/NeoEMF tutorial for MoDELS 2018.

You can find all the supporting software in this Eclipse update site (aimed at Eclipse 2018-09):

http://som-research.github.io/hawk-neoemf-models-2018-tutorial/updates/

For this tutorial, please install these features:

* Epsilon:
    * all in Core
    * all in Core Development Tools
    * within EMF integration: Development Tools for EMF, EMF Integration
* Hawk:
    * all backends
    * within Hawk Clients: Eclipse UI
    * all connectors
    * all model drivers
    * all query languages
    * time-aware indexing
* NeoEMF: all
* Mogwai: all

When indexing the larger models (set2 onwards, especially set4), you will want to tweak your `eclipse.ini` file to use `-Xms8g` and `-Xmx8g`. This is currently needed to parse some of the large monolithic XMI files.

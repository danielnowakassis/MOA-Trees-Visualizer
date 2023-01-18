## MOA Hoeffding Trees Visualizer

This code generates a .dot file that Graphviz compile and plots Hoeffding-based Trees from MOA. 

## Ｈｏｗ ｔｏ ｒｕｎ <img src = "https://media1.giphy.com/media/JZ40cnfnN11KycrvMF/giphy.gif?cid=ecf05e47a0n3gi1bfqntqmob8g9aid1oyj2wr3ds3mg700bl&rid=giphy.gif" width = 23px>

-       install [Graphviz](https://graphviz.org/download/)

-       insert the HoeffdingTreeVisualizer into MOA(https://moa.cms.waikato.ac.nz/tutorial-6-building-moa-from-the-source/) classifiers/trees folder

-       run Main

-       put the output into a .dot file

-       run the following command:

```yaml
dot -Tpng .\tree.dot -o tree.png
```

## Ｉｎｔｅｒｐｒｅｔ ｔｈｅ ｔｒｅｅ ｐｌｏｔ

-       For numerical attributes, left means True (<=) and right means False (>)

-       For nominal attibutes, all the adjacencies means the attribute values in order (from 0 to n attribute values)
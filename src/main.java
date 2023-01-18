package moa.classifiers.meta;


import moa.classifiers.AbstractClassifier;
import moa.classifiers.trees.*;
import moa.evaluation.BasicClassificationPerformanceEvaluator;
import moa.evaluation.preview.LearningCurve;
import moa.streams.ArffFileStream;
import moa.tasks.EvaluatePrequential;


public class Ht2graphviz {

    public static void main(String[] args) {
        //tree
    	HoeffdingTreeVisualizer learner = new HoeffdingTreeVisualizer();
        //Stream
        ArffFileStream stream = new ArffFileStream("rialto.arff", -1);
        stream.prepareForUse();
        BasicClassificationPerformanceEvaluator evaluator = new BasicClassificationPerformanceEvaluator();
        evaluator.precisionRecallOutputOption.setValue(true);
        EvaluatePrequential task = new EvaluatePrequential();
        task.learnerOption.setCurrentObject(learner);
        task.streamOption.setCurrentObject(stream);
        task.evaluatorOption.setCurrentObject(evaluator);
        task.prepareForUse();
        task.doTask();

        // .dot Graphviz
        StringBuilder test = new StringBuilder();
        learner.getDotRepresentation(test);
        System.out.println(test);
    }
}

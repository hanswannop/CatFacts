package au.com.hotdoc.catfacts;

import java.util.Random;

/**
 * Created by hanswannop on 12/11/14.
 */
public class FactBook {
    public String[] mfacts = {
            "In 1987 cats overtook dogs as the number one pet in America.",
            "Cats that live together sometimes rub each others heads to show that they have no intention of fighting. Young cats do this more often, especially when they are excited.",
            "Mother cats teach their kittens to use the litter box.",
            "The way you treat kittens in the early stages of it's life will render it's personality traits later in life.",
            "Contrary to popular belief, the cat is a social animal. A pet cat will respond and answer to speech , and seems to enjoy human companionship.",
            "When well treated, a cat can live twenty or more years but the average life span of a domestic cat is 14 years.",
            "Neutering a cat extends its life span by two or three years.",
            "Cats, especially older cats, do get cancer. Many times this disease can be treated successfully.",
            "Cats can't taste sweets.",
            "Cats must have fat in their diet because they can't produce it on their own.",
            "Some common houseplants poisonous to cats include: English Ivy, iris, mistletoe, philodendron, and yew.",
            "Tylenol and chocolate are both poisonous to cats.",
            "Many cats cannot properly digest cow's milk. Milk and milk products give them diarrhea.",
            "The average cat food meal is the equivalent to about five mice.",
            "Cats can get tapeworms from eating mice. If your cat catches a mouse it is best to take the prize away from it."
    };
    public String getFact(){
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);
        fact = mfacts[randomNumber];
        return fact;
    }
}

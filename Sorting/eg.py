import cv2
import numpy as np
import matplotlib.pyplot as plt

image = cv2.imread('input_image.png', 0) 


gaussian_filtered = cv2.GaussianBlur(image, (5, 5), 0)